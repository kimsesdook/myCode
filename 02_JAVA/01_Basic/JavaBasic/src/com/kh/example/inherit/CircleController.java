package com.kh.example.inherit;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius){
		c = new Circle(x,y,radius);
		return c.getX()+" "+c.getY()+" "+c.getRadius() + "/" + Math.PI * radius * radius;
	}
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		return c.getX()+" "+c.getY()+" "+c.getRadius()+ "/" + Math.PI * radius * 2; 
	}

}
