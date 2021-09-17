package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Message;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	public String sayMessageFromGet() {
		return "Message from Get Method ";
	}
	
	@PostMapping("/{message}")
	public String messageFromPost(@PathVariable String message) {
		return "Message from Post Method is "+ message;
	}
	
	@PostMapping("/message")
	public Message messageFromPostBody(@RequestBody Message message) {
		return message;
	}
	
	@PutMapping("/{message}")
	public String messageFromPut(@PathVariable String message) {
		return "Message from Put Method "+ message;
	}
	
	@PatchMapping("/")
	public String maeesageFromPatch() {
		return "Hello from PATCH method";
	}
	
	@DeleteMapping("/")
	public String messageFromDelete() {
		return "Message from Delete Method ";
	}

}
