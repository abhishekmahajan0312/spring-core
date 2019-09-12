package com.tc.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.tc.springcoreassignment.interfaces.Dell;
import com.tc.springcoreassignment.interfaces.HP;
import com.tc.springcoreassignment.interfaces.Laptop;

@Component
public class LaptopConfig {
	@Bean
	public Laptop dell() {
		return new Dell();
	}
	@Bean
	public Laptop hp() {
		return new HP();
	}
}
