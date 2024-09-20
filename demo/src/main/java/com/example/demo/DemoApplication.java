package com.example.demo;

import com.google.cloud.spring.data.datastore.repository.config.EnableDatastoreRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDatastoreRepositories
public class DemoApplication {
	@Autowired
	BrowserHistoryRepo browserHistoryRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}



}
