package com.example.jenkinsexample;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JenkinsExampleApplicationTests {
    private static Logger log = (Logger) LoggerFactory.getLogger(JenkinsExampleApplicationTests.class);

    @Test
    void contextLoads() {
        log.info("Test is executing..");
        assertEquals(true, true);
    }

}
