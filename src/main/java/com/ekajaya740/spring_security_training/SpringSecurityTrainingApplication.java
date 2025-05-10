package com.ekajaya740.spring_security_training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.ekajaya740.spring_security_training.config.RSAKeyProperties;

@EnableConfigurationProperties(RSAKeyProperties.class)
@SpringBootApplication
public class SpringSecurityTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTrainingApplication.class, args);
	}

}
