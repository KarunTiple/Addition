package com.BikkadIT.Addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AdditionApplication.class, args);

		Addition addition = context.getBean(Addition.class);
		addition.sum(10, 20);
		

	}

}
