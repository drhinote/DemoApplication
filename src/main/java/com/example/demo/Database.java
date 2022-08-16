package com.example.demo;

import org.springframework.stereotype.Controller;

//@Controller
public class Database {//implements DatabaseInterface {

	public String read(String key) {
		return key + "'s value!";
	}
	
	@Override 
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
