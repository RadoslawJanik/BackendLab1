import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJsonString {

    public static void main(String[] args) throws JsonProcessingException {



        ObjectMapper mapper = new ObjectMapper();

        User userObject = new User("Jacob",14);

        String userJson =  mapper.writeValueAsString(userObject);

        System.out.println(userJson);

        }
    }

