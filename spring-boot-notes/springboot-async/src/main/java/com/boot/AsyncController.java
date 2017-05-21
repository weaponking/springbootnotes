package com.boot;

import java.util.concurrent.Future;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

	@Autowired
	private AsyncTask asyncTask;
	
	@GetMapping("/async")
	public String async() throws Exception {
		Future<String> task = asyncTask.doTask();
		while(true) {
			if(task.isDone()){
				return task.get();
			}
		}
	}
}
