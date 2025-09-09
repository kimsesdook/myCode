package com.kh.controller;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 나이를 입력받아
		 * 13세이하면 어린이로
		 * 13세초과 19세 이하면 청소년
		 * 19세 초과면 성인이 출력
		 * 
		 * [출력]
		 * 나이를 입력 : xx
		 * xx은 xx에 속합니다.
		 */
		int age;
		String str;
		age = sc.nextInt();
		
		if(age<=13) {
			str = "어린이";
		}else {
			if (age<=19) {
				str = "청소년";
			}
			else {
				str = "성인";
			}
		}
		switch(str) {
		case "어린이" : 
			System.out.println(age+"은 어린이에 속합니다");
			break;
		case "청소년" : 
			System.out.println(age+"은 청소년에 속합니다");
			break;
		case "성인" : 
			System.out.println(age+"은 성인에 속합니다");
		}
		

	}

}
