package eventServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"repository", "server"})
public class EventServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventServerApplication.class, args);
	}

}

