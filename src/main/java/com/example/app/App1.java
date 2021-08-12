package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class App1 {
    private static final Logger logger = LoggerFactory.getLogger(App1.class);

    public static void main(String[] args) {
        logger.info("Initializing App1...");
        SpringApplication.run(App1.class, args);
    }

}
