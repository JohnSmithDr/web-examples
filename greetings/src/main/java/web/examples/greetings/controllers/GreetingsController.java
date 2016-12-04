package web.examples.greetings.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.examples.greetings.domain.Greeting;
import web.examples.greetings.services.GreetingsService;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    private GreetingsService greetingsService;

    @RequestMapping("/")
    public Greeting greet(@RequestParam(defaultValue = "World") String name) {
        return greetingsService.sayHello(name);
    }

}
