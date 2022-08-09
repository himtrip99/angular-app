package com.springhub.application.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.springhub.application.entities.Greeting;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GreetingController {

	private static final String template = "Hello, %s!";
	private static final String welcome = "Welcome %s!, To Cook Green Food ";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/welcome")
	public Greeting welcome(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(welcome, name));
	}

	@GetMapping("/messages")
	public String getMessage() {
		return "Hello from Docker!";
	}
}
