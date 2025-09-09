package com.kh.example.oop41;

public class Shape {
	private int type;
	private double height;
	private double weight;
	private String color = "white";
	public Shape() {

	}
	
	public Shape(int type, double height, double weight) {
		this.type = type;
		this.height = height;
		this.weight = weight;
	}

	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String information() {
		return height+" "+" "+weight+" "+color;
	}
	
	

}
