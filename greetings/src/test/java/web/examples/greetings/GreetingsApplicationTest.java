package web.examples.greetings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import web.examples.greetings.controllers.GreetingsController;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingsApplicationTest {

    @Autowired
    private GreetingsController greetingsController;

    @Test
    public void contextLoad() {
        assertThat(greetingsController).isNotNull();
    }
}
