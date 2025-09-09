package com.kh.practice.loop;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=100;i++) {
			if(i%7!=0) {
				continue;
			}
			if(i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
