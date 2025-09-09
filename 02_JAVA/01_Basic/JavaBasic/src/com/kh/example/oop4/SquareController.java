package com.kh.example.oop4;

public class SquareController {
	Shape s = new Shape() ;
	
	
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return (s.getHeight()*2+s.getWidth()*2);
	}
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return (s.getWidth()*s.getHeight());
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "사각형"+s.information();
	}

}
