package com.boot.prop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PropController {
	
	@Value("${appName}")
	private String appName;
	@Value("${appNum}")
	private Integer appNum;
	@Value("${secret}")
	private String secret;
	
	@Autowired
	private MyProperty myProperty;
	
	@GetMapping("/prop")
	String test() {
		log.info("appName:"+appName);
		log.info("appNum:"+appNum);
		log.info("secret:"+secret);
		
		myProperty.getServers().forEach(System.out::println);
		
		return appName+" - "+appNum;
	}
	
	@Autowired
	private TestProperties testProperties;
	@Autowired
	private DevProperties devProperties;
	
	@GetMapping("/pt")
	String test1() {
		log.info(devProperties.toString()+" ---- ");
		log.info(testProperties.toString()+" ---- ");
		return devProperties.toString()+" ---- "+testProperties.toString();
	}
	
	@Autowired
	private Environment env;
	@GetMapping("/env")
	String test2() {
		//env调用其他Properties
		log.info(env.getProperty("dd.host"));
		return env.getProperty("email.address")+" ---- "+env.getProperty("email.user");
	}
}
