package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@GetMapping("/")
	public String getString() {
		return "This my First SpringBoot Appl..!";
	}

}
