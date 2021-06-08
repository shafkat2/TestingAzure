package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;



@ComponentScan
@SpringBootApplication
public class HashMapSearchEngineApplication extends SpringBootServletInitializer {
	

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HashMapSearchEngineApplication.class, args);
		mapBean map = ctx.getBean(mapBean.class);
		map.enterValue("one");
		map.enterValue("two");
		
		}	

    }


