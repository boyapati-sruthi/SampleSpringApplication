package com.example.SampleHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleHelloWorldApplication.class, args);
		System.out.println("Hello world");
	}

}
