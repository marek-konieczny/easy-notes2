package com.example.easynotes2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EasyNotes2Application {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotes2Application.class, args);
	}
}
