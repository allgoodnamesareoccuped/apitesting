package restassured;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.junit.Test;
import pojo.Category;
import pojo.Promotion;

import java.util.Iterator;
import java.util.List;

import static com.jayway.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by bjorn on 30/06/18.
 */
public class jaywayRestAssuredTests {
    private static RequestSpecification spec;

    @BeforeClass
    public static void initSpec(){
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://api.tmsandbox.co.nz")
                .setBasePath("/v1/")
                //.addFilter(new ResponseLoggingFilter()) //For logging purpose
                //.addFilter(new RequestLoggingFilter())
                .build();
    }
    @Test
    public void restAssuredJaywayTest() {

        given()
                .spec(spec)
                .param("limit", 10)
                .when()
                .get("Categories/6327/Details.json?catalogue=false")
                .then()
                .assertThat()
                .body("Name",
                        equalTo("Carbon credits")).and()
                .body("CanRelist",
                        is(true)).and()
                .body("Promotions.find {it.Name == 'Gallery'}.Description",
                        containsString("2x larger image"));


    }

    /**
     * Using pojo's with jayway and also assertJ
     */
    @Test
    public void restAssuredJaywayPojoTest() {
        Category retreivedCategory = given()
                .spec(spec)
                .when()
                .get("Categories/6327/Details.json?catalogue=false")
                .then()
                .extract().as(Category.class);
        assertThat(retreivedCategory.getName().equalsIgnoreCase("Carbon credits"));
        assertThat(retreivedCategory.getCanRelist().equals(true));
        assertThat(getDescriptionByName(retreivedCategory.getPromotions(),"Gallery").contains("2x larger image"));

    }
    private String getDescriptionByName(List<Promotion> promotions, String name) {
        String description = "";
        Iterator<Promotion> iter = promotions.iterator();
        while(iter.hasNext()){
            Promotion promotion = iter.next();
            if(promotion.getName().equalsIgnoreCase(name)){
                description = promotion.getDescription();
            }
        }
        return description;
    }
}
