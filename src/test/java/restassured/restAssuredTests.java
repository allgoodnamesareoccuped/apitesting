package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

import org.json.JSONString;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


/**
 * Created by bjorn on 30/06/18.
 */
public class restAssuredTests {

    @BeforeClass
    public static void setupRestAssured() {
        RestAssured.baseURI = "https://api.tmsandbox.co.nz";
        RestAssured.basePath = "/v1/";


    }

    /**
     * Test with given-when-then GPath
     */
    @Test
    public void testJsonGPath() {

        given().
                when().
                    get("Categories/6327/Details.json?catalogue=false").
                then().
                assertThat().
                    body("Name",
                        equalTo("Carbon credits")).and().
                    body("CanRelist",
                        is(true)).and().
                    body("Promotions.find {it.Name == 'Gallery'}.Description",
                        containsString("2x larger image"));

    }

    /**
     * Test with using response.path
     */
    @Test
    public void testJsonResponsePath() {
        Response response = get("Categories/6327/Details.json?catalogue=false");
        Assert.assertEquals("The Name is not correct","Carbon credits",response.path("Name"));
        Assert.assertTrue("The CanRelist is not true",response.path("CanRelist"));
        ArrayList<Map<String,?>> allPromotionsData = response.path("Promotions");
        Assert.assertTrue("",getMapFromList(allPromotionsData,"Gallery").get("Description").toString().contains("2x larger image"));

    }

    /**
     * Test by using jsonPath
     * Note: It's using Gpath and won't work with Jayways JsonPath
     */
    @Test
    public void testJsonPath() {
        Response response = get("Categories/6327/Details.json?catalogue=false");
        JsonPath jsonPath = new JsonPath(response.asString());
        Assert.assertEquals("The Name is not correct","Carbon credits",jsonPath.get("Name"));
        Assert.assertTrue("The CanRelist is not true",jsonPath.get("CanRelist"));
        Assert.assertTrue("", jsonPath.get("Promotions.find {it.Name == 'Gallery'}.Description").toString().contains("2x larger image"));
    }

    private Map<String,?> getMapFromList(ArrayList<Map<String,?>> list, String ss) {
        Map<String,?> foundMap = new HashMap<String, String>();
        outerloop:
        for(Map<String,?> map: list) {
            for (Map.Entry<String,?> entry : map.entrySet()) {
                if (ss.equalsIgnoreCase(entry.getValue().toString())) {
                    foundMap =  map;
                    break outerloop;
                }
            }
        }
        return foundMap;
    }
}
