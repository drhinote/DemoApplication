package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class Logger implements LoggingInterface {

	@Override
	public void log(Object val) {
		System.out.println(val.toString());
		
	}

	
}
