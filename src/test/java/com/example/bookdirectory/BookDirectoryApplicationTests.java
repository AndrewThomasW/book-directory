package com.example.bookdirectory;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookDirectoryApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(BookDirectoryApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true,true);
	}

}
