package util;

import com.fasterxml.jackson.databind.JsonNode;
import pojo.Category;

import java.io.IOException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by bjorn on 2/07/18.
 */
public class ObjectMapperDemo {
    ObjectMapper objectMapper;
    public ObjectMapperDemo() throws IOException {
        objectMapper = new ObjectMapper();
    }

    public Category readJsonWithObjectMapper(URL url) throws IOException{
        return objectMapper.readValue(url, Category.class);
    }

}
