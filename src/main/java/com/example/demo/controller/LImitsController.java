package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.PropertyConfig;
import com.example.demo.model.Limits;

@RestController
public class LImitsController {
	
	@Autowired
	PropertyConfig propertyConfig;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(propertyConfig.getMax(), propertyConfig.getMin());
	}
}
