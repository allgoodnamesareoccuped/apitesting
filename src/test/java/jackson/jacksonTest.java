package jackson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pojo.Category;
import util.JsonNodeDemo;
import util.ObjectMapperDemo;

import java.io.IOException;
import java.net.URL;

/**
 * Created by bjorn on 30/06/18.
 */
public class jacksonTest {
    private static URL baseUrl;
    ObjectMapperDemo objectMapperDemo;


    @Before
    public void initiateTest() throws IOException {
        baseUrl = new URL("https://api.tmsandbox.co.nz");
        objectMapperDemo = new ObjectMapperDemo();
    }

    @Test
    public void testJsonWithObjectMapper() {
        try {
            URL url = new URL(baseUrl, "/v1/Categories/6327/Details.json?catalogue=false");
            Category pojo = objectMapperDemo.readJsonWithObjectMapper(url);
            Assert.assertEquals(true, pojo.getCanRelist());
            Assert.assertEquals("Carbon credits", pojo.getName());
            Assert.assertTrue("",
                    pojo.getDescriptionByName("Gallery").contains("2x larger image"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadJsonWithJsonNode() {
        try

        {
            URL url = new URL(baseUrl, "/v1/Categories/6327/Details.json?catalogue=false");
            JsonNodeDemo jsonNodeDemo = new JsonNodeDemo(url);
            Assert.assertEquals(true, jsonNodeDemo.readNodeBoolean("CanRelist"));
            Assert.assertEquals("Carbon credits",jsonNodeDemo.readNodeText("Name"));
            String description = jsonNodeDemo.findValue("Promotions","Gallery","Description");
            Assert.assertTrue(description.contains("2x larger image"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
