package com.spring.app;

public class Triangle {

	private String type;
		
		
	public String getType() {
		return type;
	}
	
	//the value received is set first then you can print the get value :
	public void setType(String type) {
		this.type = type;
	}
	public void draw(){
		
		System.out.println(getType() +" Drawn Triangle");
	}
}
