package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HelloTest {

    private Hello hello;

    @BeforeEach
    public void setup() {
        hello = new Hello();
    }

    @Test
    public void shouldGreetingWithPassingName() throws Exception {
        Assertions.assertEquals("Hello, Freewind!", hello.greeting("Freewind"));
    }

}