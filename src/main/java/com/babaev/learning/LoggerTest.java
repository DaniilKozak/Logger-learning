package com.babaev.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerTest.class);
    public static void main(String... a) {
        LOGGER.info("Hello World");

    }
}
