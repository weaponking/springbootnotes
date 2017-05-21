package com.boot.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;
@Data
@ConfigurationProperties(prefix="test")
public class TestProperties {

	private String host;
	private Integer port;
	private String user;
}
