package br.com.teste.primeirorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //ablita a app p trabalhar com requisições do tipo feign client do tipo http
public class PessoasMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PessoasMsApplication.class, args);
	}
}
