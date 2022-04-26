package com.ibm.application;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.ibm.*"})
@Configuration
@EnableAutoConfiguration
@EnableWebMvc
public class CrsIbmG3SpringCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsIbmG3SpringCollectionApplication.class, args);
	}

}