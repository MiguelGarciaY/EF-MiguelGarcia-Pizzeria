package com.idat.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class EfMiguelGarciaPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfMiguelGarciaPizzeriaApplication.class, args);
	}

}
