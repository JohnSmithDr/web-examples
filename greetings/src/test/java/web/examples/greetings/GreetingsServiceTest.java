package web.examples.greetings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import web.examples.greetings.domain.Greeting;
import web.examples.greetings.services.GreetingsService;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingsServiceTest {

    @Autowired
    private GreetingsService greetingsService;

    @Test
    public void testSayHello() {
        Greeting greeting = greetingsService.sayHello("John");
        assertThat(greeting.getMessage()).isEqualTo("Hello John");
    }
}
