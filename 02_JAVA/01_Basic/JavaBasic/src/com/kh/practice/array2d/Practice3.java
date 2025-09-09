package com.kh.practice.array2d;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dohwagi = sc.nextInt();
		int [][] paper = new int[100][100];
		int count = 0;
		for(int k =0; k<dohwagi;k++) {
			int g = sc.nextInt();
			int s = sc.nextInt();
			for(int i=0;i<paper.length;i++) {
				for(int j=0;j<paper[i].length;j++) {
					if(i==g&&j==s) {
						for(i=g;i<g+10;i++) {
							for(j=s;j<s+10;j++) {
								paper[i][j]=1;
		                    }
	                     }
                     }
                  }

		      }			
		}
		for(int i=0;i<paper.length;i++) {
			for(int j=0;j<paper[i].length;j++) {
				if(paper[i][j]==1) {
					count+=1;
				}
			}
	  }
		System.out.println(count);
	}
}