package com.facts.interview.facts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.facts.interview")
public class FactsApplication {

	public static void main(String[] args) {

		SpringApplication.run(FactsApplication.class, args);
	}

}
