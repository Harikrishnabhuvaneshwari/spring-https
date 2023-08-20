package com.https;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHttps {

	public static final  Logger LOGGER = LoggerFactory.getLogger(SpringHttps.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringHttps.class, args);
		LOGGER.trace("SpringLoggingExample : Msg : {}","Trace log");
		LOGGER.debug("SpringLoggingExample : Msg : {}", "Debug log");
		LOGGER.info("SpringLoggingExample : Msg : {}", "Info log");
		LOGGER.warn("SpringLoggingExample : Msg : {}", "Warn log");
		LOGGER.error("SpringLoggingExample : Msg : {}", "Error log");
	}

}
