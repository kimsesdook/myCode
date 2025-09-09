package com.kh.practice.loop;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int m= sc.nextInt();
		for(int i=0;i<m;i++) {
			int[]arr= new int[m];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
		    System.out.println(arr[i]);
		}
		
		

	}

}
