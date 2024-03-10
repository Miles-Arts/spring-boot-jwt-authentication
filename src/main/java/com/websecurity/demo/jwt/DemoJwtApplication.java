package com.websecurity.demo.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJwtApplication {

	private final Logger logger = LoggerFactory.getLogger(DemoJwtApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoJwtApplication.class, args);
	}

}
