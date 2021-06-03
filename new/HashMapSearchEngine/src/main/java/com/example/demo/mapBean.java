package com.example.demo;

import java.util.HashMap;
import java.util.Map;




public class mapBean {

	private HashMap<String,Integer> map ;
	

    public mapBean(HashMap<String, Integer> map) {
		super();
		this.map = map;
	}

    public void setMap (HashMap<String, Integer> map) {
        this.map = map;
    }

    public HashMap<String, Integer> getMap () {
        return this.map;
    }
  
    public void enterValue(String value) {
    	this.map.put(value, 0);
    }
    
    public Boolean getValue(String value) {
		boolean exists = this.map.containsKey(value);
    	return exists;
    }
}

