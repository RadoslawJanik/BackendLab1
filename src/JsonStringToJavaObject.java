import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonStringToJavaObject {
    public static void main(String[] arg) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        String userJson = "{\"name\":\"John\",\"age\":21}";
        UserV2 userObject = objectMapper.readValue(userJson, UserV2.class);

        System.out.println(userObject.getName()); // John
        System.out.println(userObject.getAge());  // 21
    }
}
