package com.ess.docker_kubernetes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountServiceController {
	
	@GetMapping("/accountService")
	public String sayHello() {
		return "Docker Account Service is up.";
	}

}
