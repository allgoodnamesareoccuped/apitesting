package jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import pojo.Category;
import pojo.Promotion;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bjorn on 30/06/18.
 */
public class jacksonTest {

    @Test
    public void testJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            URL url = new URL("https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false");
            Category pojo = objectMapper.readValue(url, Category.class);
            Assert.assertEquals(true, pojo.getCanRelist());
            Assert.assertEquals("Carbon credits",pojo.getName());
            Assert.assertTrue("",
                    getDescriptionByName(pojo.getPromotions(),"Gallery").contains("2x larger image"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


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
