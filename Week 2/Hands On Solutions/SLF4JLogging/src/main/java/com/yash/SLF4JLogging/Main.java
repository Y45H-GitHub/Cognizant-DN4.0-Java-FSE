package com.yash.SLF4JLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Application started.");

        try {
            int result = divide(10, 0); // will cause exception
            logger.info("Result: {}", result);
        } catch (ArithmeticException ex) {
            logger.error("Division by zero error occurred: {}", ex.getMessage());
        }

        String userStatus = "inactive";
        if ("inactive".equals(userStatus)) {
            logger.warn("User status is inactive, some features may be unavailable.");
        }

        logger.info("Application finished.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
