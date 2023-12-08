package com.ehcache.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableCaching
public class EhCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhCacheApplication.class, args);
	}

}
