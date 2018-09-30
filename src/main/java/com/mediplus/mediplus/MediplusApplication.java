package com.mediplus.mediplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MediplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediplusApplication.class, args);
		
		
	}
}
 