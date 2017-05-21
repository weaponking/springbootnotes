package com.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import com.boot.config.ExtApplicationListener;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
			.sources(MvcApplication.class)
				.listeners(new ExtApplicationListener())
					.run(args);
	}
	
	
}
