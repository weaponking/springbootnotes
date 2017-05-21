package com.boot.config;

import java.util.Optional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.boot.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

@Component
@Slf4j
public class ExtCommandLineRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		Optional<ApplicationContext> optional = Optional.of(ExtApplicationContextAware.getApplicationContext());
		optional.ifPresent((context) -> {
			log.info(((TestService) context.getBean("testService")).test());
		});
	}

}
