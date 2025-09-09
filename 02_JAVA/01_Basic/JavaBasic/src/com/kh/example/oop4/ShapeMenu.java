package com.kh.example.oop4;

import java.util.Scanner;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		int a = sc.nextInt();
		Shape s = new Shape();
		s.setType(a);
		s.getType();
	}
	public void triangleMenu() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(tc.calcArea(a, b));
	}
	public void squareMenu() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(scr.calcPerimeter(a,b));
		System.out.println(scr.calcArea(a,b));
	}
	public void inputSize(int type, int menuNum) {
		
	}
	public void printInformation(int type) {
		
	}
}
