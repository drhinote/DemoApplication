package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

	@Autowired
	AppInterface app;
	
	@Test
	void contextLoads() {
		assert(app != null);
	}
	
	@Test
	void contextIsDemo2App() {
		assert(app.Id().contains("Demo2Application"));
	}

}
