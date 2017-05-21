package com.boot.prop;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import lombok.Data;
@Data
@ConfigurationProperties(prefix="dd")
@Validated
public class DevProperties {
	@NotEmpty
	private String host;
	private Integer port;
	private String user;
}
