package com.boot.sample;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

	@GetMapping("/1")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("hello word");
	}
	
	@GetMapping("/2")
	public ResponseEntity<Map<String, Object>> test1() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", 1);
		map.put("key2", "val2");
		map.put("key3", false);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.ACCEPTED);
	}
}
