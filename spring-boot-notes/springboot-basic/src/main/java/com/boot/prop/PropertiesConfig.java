package com.boot.prop;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties({DevProperties.class,TestProperties.class})
public class PropertiesConfig {
	

}
//SpringApplication will load properties from application.properties files in the following locations and add them to the Spring Environment:
//
//    A /config subdirectory of the current directory.
//    The current directory
//    A classpath /config package
//    The classpath root
//
//The list is ordered by precedence (properties defined in locations higher in the list override those defined in lower locations).