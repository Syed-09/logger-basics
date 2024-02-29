package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Logger analyticsLogger = LoggerFactory.getLogger("analytics");
    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.info("This is an info message");
        logger.trace("This is an info message");
        logger.debug("Received request from 122.33.22.1");
        logger.warn("Connection failed... Retrying... ");
        logger.error("Failed to Execute IO");

        analyticsLogger.debug("Received request from 122.33.22.1");
        analyticsLogger.warn("Connection failed... Retrying... ");
        analyticsLogger.error("Failed to Execute IO");

        Integer empId = 101;
        String company = "PS";

        logger.info("Emp with {} in {} got a new house in neighborhood", empId, company);
    }

}
