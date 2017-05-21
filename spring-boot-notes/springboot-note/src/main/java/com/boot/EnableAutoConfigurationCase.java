package com.boot;

public class EnableAutoConfigurationCase {

//	The second class-level annotation is @EnableAutoConfiguration. This annotation tells Spring Boot to “guess” 
//		how you will want to configure Spring, based on the jar dependencies that you have added. 
//			Since spring-boot-starter-web added Tomcat and Spring MVC, the auto-configuration 
//				will assume that you are developing a web application and setup Spring accordingly.
//
//
//	Auto-configuration is designed to work well with “Starters”, but the two concepts are not directly tied. 
//		You are free to pick-and-choose jar dependencies outside of the starters and Spring Boot 
//			will still do its best to auto-configure your application.
	
}
