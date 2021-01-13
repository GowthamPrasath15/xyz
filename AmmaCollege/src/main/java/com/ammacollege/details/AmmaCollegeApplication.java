package com.ammacollege.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AmmaCollegeApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to our app");
		SpringApplication.run(AmmaCollegeApplication.class, args);
	}

}
