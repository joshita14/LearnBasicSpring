package com.spring.app;

public class Triangle1 {
	
	private Points pointA;
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

	private Points pointB;
	
	public Points getPoint() {
		return pointA;
	}

	public void setPoint(Points point) {
		this.pointA = point;
	}
	
	void draw(){
		System.out.println("("+pointA.getX()+","+pointA.getY()+")");
		System.out.println("("+pointB.getX()+","+pointB.getY()+")");
	}
	

}
