package com.example.bookdirectory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BookDirectoryApplication {


	private static Logger logger = LoggerFactory.getLogger(BookDirectoryApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started...");
	}

	public static void main(String[] args) {

		logger.info("Application executed ..");
		SpringApplication.run(BookDirectoryApplication.class, args);
	}

}
