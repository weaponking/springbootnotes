package com.boot;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@ConfigurationProperties(prefix="yml")
@Data
public class YmlProperties {

	private String address;
	private StaticPro staticPro;
	private List<ExternalPro> externalPros;
	
	@Data
	public static class StaticPro {
		private long id;
		private String name;
	}
}
