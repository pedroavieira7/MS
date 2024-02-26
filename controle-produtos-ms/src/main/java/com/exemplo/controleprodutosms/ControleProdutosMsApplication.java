package com.exemplo.controleprodutosms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  
public class ControleProdutosMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleProdutosMsApplication.class, args);
	}

}
