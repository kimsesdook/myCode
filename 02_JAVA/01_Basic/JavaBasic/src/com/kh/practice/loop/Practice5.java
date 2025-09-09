package com.kh.practice.loop;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println();
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		}

	}

}
