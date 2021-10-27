package com.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerObjetivos {
	@GetMapping("/")
	
	public String objetivos() {
		return "Create a Spring Boot application, connect it to a MySQL database, and then deploy to Heroku";				
	}
}