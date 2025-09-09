package com.kh.example.oop4;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	
	public Shape() {

	}

	public Shape(int type, double height, double width, String color) {
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		if(type==3||type==4) {
			this.type = type;
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String information() {
		return height+"높이"+width+"너비"+color+"색상";
	}
	
	

}
