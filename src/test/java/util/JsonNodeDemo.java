package util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

/**
 * Created by bjorn on 2/07/18.
 */
public class JsonNodeDemo {
    ObjectMapper objectMapper;
    JsonNode jsonNode;
    public JsonNodeDemo(URL url) throws IOException{
        objectMapper = new ObjectMapper();
        jsonNode = objectMapper.readTree(url);
    }
    public String readNodeText(String name) {
       return jsonNode.get(name).asText();
    }
    public boolean readNodeBoolean(String name) {
        return jsonNode.get(name).asBoolean();
    }
    public String findValue(String mapName, String nameField, String fieldName) {
        String foundValue="";
        JsonNode node = jsonNode.withArray(mapName);
        Iterator<JsonNode> iterator = node.iterator();
        while(iterator.hasNext()){
            JsonNode aJsonNode = iterator.next();
            if(aJsonNode.get("Name").asText().equalsIgnoreCase(nameField)){
                foundValue = aJsonNode.get(fieldName).asText();
            }
        }
        return foundValue;
    }
}
