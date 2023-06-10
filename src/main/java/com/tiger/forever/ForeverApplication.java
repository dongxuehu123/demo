package com.tiger.forever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tiger.forever.controller"})
public class ForeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForeverApplication.class, args);
	}

}
