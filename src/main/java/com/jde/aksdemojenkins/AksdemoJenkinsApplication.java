package com.jde.aksdemojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AksdemoJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AksdemoJenkinsApplication.class, args);
	}

	@GetMapping("/")
	public String greet() {
		return "Hello, your SB app works!";
	}

}
