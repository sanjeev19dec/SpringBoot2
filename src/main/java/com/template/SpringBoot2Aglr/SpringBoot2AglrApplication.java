package com.template.SpringBoot2Aglr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.ReservationResource;

@SpringBootApplication
@ComponentScan(basePackages = "com.template.SpringBoot2Aglr")
@ComponentScan(basePackageClasses = ReservationResource.class)
public class SpringBoot2AglrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2AglrApplication.class, args);
	}

}
