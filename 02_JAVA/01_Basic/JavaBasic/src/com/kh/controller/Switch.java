package com.kh.controller;

import java.util.Scanner;

public class Switch {
	/*
	 * switch문도 if문과 동일하게 조건문
	 * 
	 * 다만, switch문은 값이 정확하게 일치(동등비교)하는 경우에만 사용 됨
	 * 
	 * [표현식]
	 * switch(비교대상(정수,문자,문자열)){
	 * case 값 1 : 실행코드
	 * case 값 2 : 실행코드
	 * ...
	 * ..
	 * .
	 * default : 위의 값이 전부 일치하지 않았을 때 실행할 코드;
	 * 
	 * break -> switch문 내에서 사용하면 해당코드가 실행됨고 동시에 가장 가까운 switch문을 종료
	 * }
	 */

	public static void main(String[] args) {
		
		/*
		 * 정수를 입력받아서
		 * 1일경우 5일경우 빨간색입니다.
		 * 2일경우 파란색입니다
		 * 3일경우 초록색입니다
		 * 다른경우는 모두 잘못입력했습니다.를 출력
		 */
		Scanner sc = new Scanner(System.in);
		/*System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
		case 5:
			System.out.println("빨간색입니다");
			break;
		case 2 : 
			System.out.println("파란색입니다");
			break;
		case 3 : 
			System.out.println("초록색입니다");
			break;
		default : 
			System.out.println("잘못 입력 입니다.");
		}
		*/
		/*과일을 구매하는 프로그램을 작성하자
		 * 구매하고자 하는 과일을 입력하면
		 * 그에맞는 가격이 출력되는 프로그램
		 * 
		 * [출력]
		 * 구매하고자하는 과일(사과(2000),바나나(3000),딸기(5000)) : xxx
		 * xxx의 가격은 xx입니다.  출력 / 잘못입력입ㄴ다.
		 */
		/*
		String str1;
		int price = 0;
		System.out.print("구매하고자 하는 과일 (사과(2000),바나나(3000),딸기(5000)) : ");
		str1 = sc.next();
		
		switch(str1) {
		case "사과" : 
			price = 2000;
			break;
		case "바나나" : 
			price = 3000;
			break;
		case "딸기" : 
			price = 5000;
			break;
		}
		if(price == 0) {
			System.out.println("잘못입력 하셨습니다");
		}else {
			System.out.println(str1+"가격은"+price+"원입니다");
		}
		*/
		
		/*
		 * 해당월을 입력받아서 해당 월에 마지막일이 며칠인지를 출력하는 프로그램 작성
		 * [출력]
		 * 월을 입력하세여 :xx
		 * xx월은 xx일까지 있습니다.
		 * 
		 */
		int m;
		int d = 0;
		System.out.print("월을 입력하세요 : ");
		m = sc.nextInt();
		
		switch(m) {
		case 1,3,5,7,8,10,12:
			d = 31;
		    break;
		case 4,6,9,11:
			d = 30;
		    break;
		case 2:
			d=28;
			break;
		}
		if (d ==31) {
			System.out.println(m+"월은 31일까지 있습니다.");
		}
		else if(d==30) {
			System.out.println(m+"월은 30일까지 있습니다.");
		}
		else {
			System.out.println(m+"월은 28일까지 있습니다.");
		}
		
			
		

	}
}