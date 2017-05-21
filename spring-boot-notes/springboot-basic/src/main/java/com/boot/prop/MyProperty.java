package com.boot.prop;

import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import lombok.Data;
@Data
@ConfigurationProperties(prefix="my")
@Component
@Validated
public class MyProperty {
	@NotNull
	private List<String> servers;
}
//@ConfigurationProperties添加
//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-configuration-processor</artifactId>
//<optional>true</optional>
//</dependency>