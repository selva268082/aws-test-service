package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//
public class AwsTestSpringbootApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome to aws selva!";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(AwsTestSpringbootApplication.class, args);
	}

}
