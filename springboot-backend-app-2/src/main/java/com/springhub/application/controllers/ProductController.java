package com.springhub.application.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.springhub.application.entities.Greeting;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/products")
	public String getMessage() {
		return "A brand new product " + counter.incrementAndGet();
	}
}
