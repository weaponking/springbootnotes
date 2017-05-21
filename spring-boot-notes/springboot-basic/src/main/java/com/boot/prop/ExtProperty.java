package com.boot.prop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/config/email.properties")
public class ExtProperty {}
