package com.boot;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

	public String pcf(HttpRequest request) {
		return "run by pivotal io : "+request.toString();
	}
}
