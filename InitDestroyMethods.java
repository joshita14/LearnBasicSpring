package com.spring.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDestroyMethods implements InitializingBean, DisposableBean{
	
	private Points pointA;
	private Points pointB;

	
	public Points getPointA() {
		return pointA;
	}
	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	public Points getPointB() {
		return pointB;
	}
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	
	void draw(){
		
		System.out.println("("+pointA.getX()+","+pointA.getY()+")");
		System.out.println("("+pointB.getX()+","+pointB.getY()+")");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is called as soon as bean is initialized");
		
	}
	public void destroy() throws Exception {
		System.out.println("This is called as soon as bean is destroyed");
		
	}
	
	void myInint(){
		System.out.println("This is my init method");
	}
	
	void myDestroy(){
		
		System.out.println("This is my destroy");
	}
	
}
