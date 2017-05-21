package com.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class LogbackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LogbackApplication.class, args);
	}

	public void run(String... args) throws Exception {
		log.debug("logback test debug");
		log.info("logback test info");
		log.error("logback test error");
		log.warn("logback test warn");
	}
}
