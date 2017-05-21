package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class YmlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(YmlApplication.class, args);
	}
	@Autowired
	YmlProperties YmlProperties;
	
	public void run(String... args) throws Exception {
		
		YmlProperties.getExternalPros().forEach(System.out::println);
		
		log.info(YmlProperties.toString());
	}
}
