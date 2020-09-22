package com.ishnit.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishnit.microservice.limitsservice.Configuration;
import com.ishnit.microservice.limitsservice.dojo.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromCongfiguration() {
		//return new LimitConfiguration(1,  1000);
		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
	}

}
