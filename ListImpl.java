package com.spring.app;

import java.util.List;

public class ListImpl {
	
	List<Points> listOfPoints;

	public List<Points> getListOfPoints() {
		return listOfPoints;
	}

	public void setListOfPoints(List<Points> listOfPoints) {
		this.listOfPoints = listOfPoints;
	}
	
	void draw(){
		
		for(Points point : listOfPoints){
			
			System.out.println("Printing lists \n");
			System.out.println("("+point.getX()+","+point.getY()+")");
			
		}
	}

}
