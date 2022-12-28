package com.faith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MozantoAssApplication {

	public static void main(String[] args) {
		SpringApplication.run(MozantoAssApplication.class, args);
		System.out.println("Welcome");
	}

}
