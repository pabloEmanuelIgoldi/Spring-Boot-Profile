package com.appprofile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@Value("${msj.enviroment}")
	private String msj;
	
	@GetMapping
	public String get() {
		return "BIENVENIDO AL AMBIENTE "+ this.msj + ".";
	}

}
