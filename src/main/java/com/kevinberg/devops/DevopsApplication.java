package com.kevinberg.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}


	//TODO Sørg for at applikasjonen bygger med mvn, og starter en webserver på localhost:8080
	// mvn spring-boot:run

}
