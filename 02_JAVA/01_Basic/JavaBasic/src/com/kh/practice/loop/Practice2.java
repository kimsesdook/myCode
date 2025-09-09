package com.kh.practice.loop;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			sum+=n;
			if(n<0) {
				sum+=-(n);
				System.out.println("총합 : "+ sum);
				break;
			}
		}

	}

}
