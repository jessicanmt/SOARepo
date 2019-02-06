package event;

import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EventAppApplication {
    public static void main(String[] args) throws Exception {
    	HashMap<String, Object> props = new HashMap<String, Object>();
    	props.put("server.port", 9999);
    	new SpringApplicationBuilder().sources(EventAppApplication.class).properties(props).run(args);
    }
}