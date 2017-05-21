package com.boot.ehcache;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boot.User;
import com.boot.Utils;
@RestController
@RequestMapping("/e")
public class EhCacheController {
	
	@Autowired
	private EhCacheService ehCacheService;
	
	@GetMapping(value = {"","/list"})
	public List<User> eGetList() {
		return ehCacheService.queryUsers();
	}
	
	@GetMapping("/s/{id}")
	public User single(@PathVariable long id) {
		return ehCacheService.queryUser(id);
	}
	
	@GetMapping("/c")
	public boolean clear() {
		return ehCacheService.clearCache();
	}
	
	@GetMapping("/ca")
	public boolean clearAll() {
		return ehCacheService.clearAllCache();
	}
	
	@GetMapping("/pt/{id}")
	public User putCache(@PathVariable long id) {
		return ehCacheService.save(id);
	}
	
	@GetMapping("/login/{id}")
	public User login(@PathVariable long id) {
		return ehCacheService.login(Utils.single(id));
	}
	
}
