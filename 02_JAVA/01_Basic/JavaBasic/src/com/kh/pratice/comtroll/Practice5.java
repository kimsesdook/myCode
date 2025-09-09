package com.kh.pratice.comtroll;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();

		
		for(int i=0; i<s; i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			int sum =(a+b);
			System.out.println("Case #x:" + sum);
		}

	}

}
