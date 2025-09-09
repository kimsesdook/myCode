package com.kh.operator;

import java.util.Scanner;

public class Practice2 {
	/*
	 * 키보드로 정수 두개를 입력받아 두 수의 합,차,곲,나누기 값을 출력
	 * 
	 * [출력]
	 * 첫번째 정수 : 키보드 입력
	 * 두번째 정수 : 키보드 ㅇ비력
	 * 
	 * 더하기 : n
	 * 빼기 : n
	 * 곱하기 : n
	 * 나누기 :n
	 * 나머지 : n
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.println("더하기 : "+ (a+b));
		System.out.println("빼기 : "+ (a-b));
		System.out.println("곱하기 : "+ (a*b));
		System.out.println("나누기 : "+ (a/b));
		System.out.println("나머지 : "+ (a%b));

	}

}
