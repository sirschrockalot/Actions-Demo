package com.example.gitactions.gitactionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitActionsServiceApplication.class, args);
	}

	@GetMapping("/action")
	public String getActions(){
		return "Go Actions Go....Go..GO";
	}
}

