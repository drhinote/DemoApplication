package com.example.demo;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class MainControllerTests {
	
	@Autowired
	MainController controller;
	@Autowired
	DatabaseInterface mockDb;
	
	@Test
	void test() {
		when(mockDb.toString()).thenReturn("Mock database");
		assert(controller.base().equals("Hello world"));
	}

}
