package com.kh.practice.loop;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
			
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i]) {
				int a =0;
				a = arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=a;
			}
			
			
			
		}

		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]<arr[i-1]) {
				int a =0;
				a = arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=a;
			}
			
			
		}

		System.out.println(arr[0]+" "+arr[arr.length-1]);
		
		
		

	}

}
