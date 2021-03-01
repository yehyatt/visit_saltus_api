package com.visit.saltus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class VisitSaltusApplication
{

	public static void main(String[] args) {
		SpringApplication.run(VisitSaltusApplication.class, args);
	}
}
