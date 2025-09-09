package com.kh.practicetotal;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] defaultch = {1,1,2,2,2,8};
		int [] white = new int[6];
		
		for(int i=0;i<white.length;i++) {
			white[i] = sc.nextInt();
		}
		for(int i=0;i<white.length;i++) {
			if((defaultch[i]-white[i])>=0) {
				white[i]=defaultch[i]-white[i];
			}
			else {
				white[i] = white[i]-(white[i]-defaultch[i]);
			}
		}
		for(int i=0;i<white.length;i++) {
			System.out.print(white[i]+" ");
		}

	}

}
