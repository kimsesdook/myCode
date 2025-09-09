package com.kh.example.oop4;

public class TriangleController {
	Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return (s.getWidth() * s.getHeight() / 2);
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "삼각형"+s.information();
	}

}
