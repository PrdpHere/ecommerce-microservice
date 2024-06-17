package com.general.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.general.productcatalog.repository")
public class ProductCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.general.productcatalog.ProductCatalogApplication.class, args);
	}

}
