package com.kh.pratice.comtroll;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		if (a==b&&b==c) {
			System.out.println("출력:");
			System.out.println(10000 +a*1000);
		}
		else if(a==b||b==c||c==a) {
			System.out.println("출력:");
			System.out.println(1000 +a*100);
		}
		else {
			if(a>b&&a>c) {
				System.out.println("출력:");
				System.out.println(a*100);
			}else if(b>a&&b>c) {
				System.out.println("출력:");
				System.out.println(b*100);
			}else {
				System.out.println("출력:");
				System.out.println(c*100);
			}
		}
		/*
		 * java에서 제공해주는 수학함수
		 * java.lang.Math - > 코드를 작성할 대 기본적으로 유요한 것들을 담아서 제공해줌.
		 */


	}

}
