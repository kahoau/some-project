package com.example.demo;

import com.example.demo.service.DemoService;
import com.example.demo.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(DemoService demoService, StudentService studentService) {
		return args -> {

			// 1 1 2 3 5 8 13
			for (int i = 8; i > 1; i--) {
				System.out.println("input: " + i + " fibo result: " +demoService.fibo(i));
			}
		};
	}
}
