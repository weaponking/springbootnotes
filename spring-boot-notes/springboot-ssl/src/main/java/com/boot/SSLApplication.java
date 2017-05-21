package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SSLApplication {

	public static void main(String[] args) {
		SpringApplication.run(SSLApplication.class, args);
	}
	
	@GetMapping
	String test() {
		return "ssl test";
	}
	
}
//keytool -genkey -alias serverkey -keystore server.jks