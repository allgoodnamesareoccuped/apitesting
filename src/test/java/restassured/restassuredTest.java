package restassured;
import org.junit.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
/**
 * Created by bjorn on 30/06/18.
 */
public class restassuredTest {

    @Test
    public void testJson() {
        RestAssured.
                when().
                get("https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false").
                then().assertThat().
                body("Name",
                        equalTo("Carbon credits")).and().
                body("CanRelist",
                        is(true)).and().
                body("Promotions.find {it.Name == 'Gallery'}.Description",
                        containsString("2x larger image"));

    }
}
