package com.esi.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {
		DatabaseInitializer.initialize("studentsservice_db");
		SpringApplication.run(StudentServiceApplication.class, args);
	}
}
