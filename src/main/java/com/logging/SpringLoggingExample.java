package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLoggingExample {

	public static final  Logger LOGGER = LoggerFactory.getLogger(SpringLoggingExample.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingExample.class, args);
		LOGGER.trace("SpringLoggingExample : Msg : {}","Trace log");
		LOGGER.debug("SpringLoggingExample : Msg : {}", "Debug log");
		LOGGER.info("SpringLoggingExample : Msg : {}", "Info log");
		LOGGER.warn("SpringLoggingExample : Msg : {}", "Warn log");
		LOGGER.error("SpringLoggingExample : Msg : {}", "Error log");
	}

}
