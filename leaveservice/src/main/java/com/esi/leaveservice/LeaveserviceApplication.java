package com.esi.leaveservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaveserviceApplication {

	public static void main(String[] args) {
		DatabaseInitializer.initialize("leaveservice_db");
		SpringApplication.run(LeaveserviceApplication.class, args);
	}
}
