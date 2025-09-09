package com.kh.example.oop41;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4,height,width);
		return s.getWeight()*2+s.getHeight()*2;
	}
	public double calcArea(double height, double width) {
		s = new Shape(4,height,width);
		return s.getWeight()*s.getHeight();
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "사각형 " + s.information();
	}
	
	

}
