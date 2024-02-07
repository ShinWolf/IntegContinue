package com.example.integrationcontinue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

@SpringBootApplication
public class IntegrationContinueApplication {
    Logger logger = Logger.getLogger(getClass().getName());
    public static void main(String[] args) {
        SpringApplication.run(IntegrationContinueApplication.class, args);
    }
}
