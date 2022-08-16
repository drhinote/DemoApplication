package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class Serializer implements SerializerInterace {

	@Override
	public String serialize(Object obj) {
		return obj.toString();
	}
	
	
}
