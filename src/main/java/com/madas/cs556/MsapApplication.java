package com.madas.cs556;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MsapApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsapApplication.class, args);
	}

}
