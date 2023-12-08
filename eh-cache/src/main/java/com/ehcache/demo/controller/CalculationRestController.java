package com.ehcache.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehcache.demo.service.CalculationService;

@RestController
@RequestMapping("/rest/calculate")
public class CalculationRestController {
	@Autowired
	private final CalculationService calculationService;

	public CalculationRestController(CalculationService calculationService) {
		this.calculationService = calculationService;
	}

	@GetMapping(path = "/areaOfCircle", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Double> areaOfCircle(@RequestParam int radius) {
		double result = calculationService.areaOfCircle(radius);
		return ResponseEntity.ok(result);
	}
}
