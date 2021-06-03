package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MapController {
	
	@Autowired
	@Qualifier("beanMap")
	private mapBean map;
	
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		
		return "Welcome to Spring Boot to paths - mapPut/mapGet";
		}
	

	@RequestMapping("mapPut/{cid}")
	@ResponseBody
	public String checkQRCode(@PathVariable("cid") String cid) {
		map.enterValue(cid);
		
		return cid;
		}
	
	@RequestMapping("mapGet/{cid}")
	@ResponseBody
	public String putQRCode(@PathVariable("cid") String cid) {
	
		if (map.getValue(cid)) {
			return "value found";
		}
		
		
		return "value not found";
		}
}