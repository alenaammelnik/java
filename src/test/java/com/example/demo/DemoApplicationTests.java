package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
        "spring.security.user.name=admin",
        "spring.security.user.password=admin123"
})
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
}