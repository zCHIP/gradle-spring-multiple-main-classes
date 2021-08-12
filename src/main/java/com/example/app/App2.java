package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class App2 {
    private static final Logger logger = LoggerFactory.getLogger(App2.class);

    public static void main(String[] args) {
        logger.info("Initializing App2...");
        SpringApplication.run(App1.class, args);
    }
}
