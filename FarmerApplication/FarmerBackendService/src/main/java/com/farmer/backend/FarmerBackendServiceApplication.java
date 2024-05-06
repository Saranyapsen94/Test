package com.farmer.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.farmer.backend.entity.MainClass;

@SpringBootApplication
public class FarmerBackendServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FarmerBackendServiceApplication.class, args);
		MainClass base =context.getBean(MainClass.class);
		base.getMyMethod();
	}

}
