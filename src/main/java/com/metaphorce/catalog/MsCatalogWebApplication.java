package com.metaphorce.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.metaphorce.commonslib")
public class MsCatalogWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCatalogWebApplication.class, args);
	}

}
