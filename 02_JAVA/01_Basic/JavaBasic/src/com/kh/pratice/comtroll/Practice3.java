package com.kh.pratice.comtroll;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dis;
		String a;
		int money;
		String day;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		System.out.print("요일을 입력하시오 : ");
		day = sc.next();
		if (age >= 0 && age<= 12) {
			a="어린이";
		}
		else if(age >= 13 && age<= 18) {
			a="청소년";
		}
		else {
			a="성인";
		}
		switch(a) {
		case "어린이" : 
			money = 5000;
			dis= (int)(money*0.2);
			switch (day) {
			case "토","일":
				money-=dis;
				System.out.println(a+"요금입니다(주말 할인 적용)");
				System.out.println("최종 요금은"+money + "입니다.");
				break;
			default :
				System.out.println(a+"요금입니다");
				System.out.println("최종 요금은"+money + "입니다.");
			}
			break;
		case "청소년" : 
			money = 7000;
			dis= (int)(money*0.2);
			switch (day) {
			case "토","일":
				money-=dis;
				System.out.println(a+"요금입니다(주말 할인 적용)");
				System.out.println("최종 요금은"+money + "입니다.");
				break;
			default :
				System.out.println(a+"요금입니다");
				System.out.println("최종 요금은"+money + "입니다.");
			}
			break;
		case "성인" : 
			money = 10000;
			dis= (int)(money*0.2);
			switch (day) {
			case "토","일":
				money-=dis;
				System.out.println(a+"요금입니다(주말 할인 적용)");
				System.out.println("최종 요금은"+money + "입니다.");
				break;
			default :
				System.out.println(a+"요금입니다");
				System.out.println("최종 요금은"+money + "입니다.");
			}
			break;
		}	

		

	}

}
