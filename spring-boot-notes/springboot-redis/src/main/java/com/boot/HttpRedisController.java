package com.boot;

import java.util.UUID;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpRedisController {

	@GetMapping("/")
	public String saveSession(HttpSession session) {
		UUID uid = (UUID) session.getAttribute("uid");
		if (uid == null) {
			uid = UUID.randomUUID();
		}
		session.setAttribute("uid", uid);
		return uid.toString();
	}
	
	@GetMapping("/1")
	public String getSession(HttpSession session) {
		return session.getAttribute("uid").toString();
	}
}
