package com.rodero.roderows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RoderoWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoderoWsApplication.class, args);
	}

}
