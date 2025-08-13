package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    public void testSayHello() {
        HelloController controller = new HelloController();
        String response = controller.sayHello();
        assertThat(response).isEqualTo("Hello from Enterprise Demo!");
    }
}
