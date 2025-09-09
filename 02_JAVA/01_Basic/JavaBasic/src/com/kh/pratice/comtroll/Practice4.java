package com.kh.pratice.comtroll;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int f = sc.nextInt();
		
		int s1 = 0;
		for(int i =0; i<f; i++) {
			int p = sc.nextInt();
			int s = sc.nextInt();
			s1+=p*s;
		}
		if(sum==s1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
