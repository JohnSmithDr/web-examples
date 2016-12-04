package web.examples.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableWebMvc
@SpringBootConfiguration
public class GreetingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingsApplication.class, args);
    }

}
