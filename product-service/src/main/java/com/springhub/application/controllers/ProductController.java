package com.springhub.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/products")
	public String getMessage() {
		return "A brand new product " + counter.incrementAndGet();
	}
}
