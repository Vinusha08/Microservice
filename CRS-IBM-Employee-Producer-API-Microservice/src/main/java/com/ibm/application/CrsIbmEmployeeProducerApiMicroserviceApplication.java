package com.ibm.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.ibm.*"})
@EnableAutoConfiguration
@EnableWebMvc
@EnableDiscoveryClient
public class CrsIbmEmployeeProducerApiMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsIbmEmployeeProducerApiMicroserviceApplication.class, args);
	}

}
