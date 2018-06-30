package jackson;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Category;
import pojo.Promotion;

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
            Iterator<Promotion> iter = pojo.getPromotions().iterator();
            String description = "";
            while(iter.hasNext()) {
                Promotion promotion = iter.next();
                if(promotion.getName().equalsIgnoreCase("Gallery")){
                    description = promotion.getDescription();
                }
            }
            Assert.assertTrue("", description.contains("2x larger image"));

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
