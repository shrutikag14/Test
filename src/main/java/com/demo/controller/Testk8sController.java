package com.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testk8sController {

	@GetMapping("/")
	public String getk8Data() {
		return "test k8s up again";
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> body) {
		
		String str="";
		
		if(body.get("uid").equals("Admin") && body.get("pwd").equals("Admin")) {
			str="logged-in successfully";
		}
		else 
			str= "invalid user. please check the credentials";
		
		return str;
			
	}
	
		
}

