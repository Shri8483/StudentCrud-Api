package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudApiApplication.class, args);
		
		System.out.println("Application Start");
	}

}
