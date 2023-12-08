package com.ehcache.demo.service;

import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
	private final org.slf4j.Logger LOG = LoggerFactory.getLogger(CalculationService.class);

	@Cacheable(value = "areaOfCircleCache", key = "#radius", condition = "#radius > 5")
	public double areaOfCircle(int radius) {
		LOG.info("calculate the area of a circle with a radius of {}", radius);
		return Math.PI * Math.pow(radius, 2);
	}

}
