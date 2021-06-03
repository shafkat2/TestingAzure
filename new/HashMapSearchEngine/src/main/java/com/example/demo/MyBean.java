package com.example.demo;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {
	
	@Bean(name="beanMap")
    public mapBean myBean() {
		return new mapBean(new HashMap<String,Integer>());
	}
	
}
