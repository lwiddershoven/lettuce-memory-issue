package com.example.lettucememoryleak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LettuceMemoryLeakApplication {

	public static void main(String[] args) {
		SpringApplication.run(LettuceMemoryLeakApplication.class, args);
	}
}
