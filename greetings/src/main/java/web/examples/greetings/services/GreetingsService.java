package web.examples.greetings.services;

import org.springframework.stereotype.Service;
import web.examples.greetings.domain.Greeting;

@Service
public class GreetingsService {

    public Greeting sayHello(String name) {
        return new Greeting("Hello " + name);
    }

}
