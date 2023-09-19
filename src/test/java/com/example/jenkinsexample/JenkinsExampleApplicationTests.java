package com.example.jenkinsexample;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class JenkinsExampleApplicationTests {

    @Test
    void contextLoads() {
        log.info("Test is executing..");
        assertEquals(true, true);
    }

}
