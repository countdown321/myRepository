package com.example.demo0403;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Demo0403Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo0403Application.class, args);
	}

}
