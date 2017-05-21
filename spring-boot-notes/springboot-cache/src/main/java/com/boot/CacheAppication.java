package com.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
public class CacheAppication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
    		.sources(CacheAppication.class)
    			.run(args);
	}
}
