package com.babaev.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerTest.class);
    public static void main(String... a) {
        LOGGER.trace("Console logger test trace");
        LOGGER.debug("Console logger test debug");
        LOGGER.info("Console logger test info");
        LOGGER.warn("Console logger test error");
        LOGGER.error("Console logger test error");

    }
}
