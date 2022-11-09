package com.cicerone.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		Translator translator= context.getBean(Translator.class);
		translator.show();
	}
/*
	@GetMapping
	public String hello(){
		return "hello World";
	}
*/
}
