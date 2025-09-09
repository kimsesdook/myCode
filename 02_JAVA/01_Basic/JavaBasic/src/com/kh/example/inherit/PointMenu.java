package com.kh.example.inherit;

import java.util.Scanner;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rr = new RectangleController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1 :
			this.circleMenu();
			break;
		case 2 :
			this.rectangleMenu();
			break;
		case 9 :
			System.out.println("종료합니다.");
			return;
		}
		}
	}
	public void circleMenu() {
		while(true) {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 :
			this.calcCircum();
			break;
		case 2 :
			this.calcArea();
			break;
		case 9 :
			return;
		}
		}
	}
	public void rectangleMenu() {
		while(true) {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1 :
			this.calcPerimeter();
			break;
		case 2 :
			this.calcRectArea();
			break;
		case 9 :
			return;
		}	

		}
	}
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int ra = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, ra));
		
	}
	public void calcArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int ra = sc.nextInt();
		System.out.println(cc.calcArea(x, y, ra));
	}
	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int h = sc.nextInt();
		System.out.println("너비 : ");
		int w = sc.nextInt();
		System.out.println(rr.calcPerimeter(x, y, h, w));

	}
	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int h = sc.nextInt();
		System.out.println("너비 : ");
		int w = sc.nextInt();
		System.out.println(rr.calcArea(x, y, h, w));
	}

}
