package com.kh.pratice.comtroll;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if (score>=90&&score<=100) {
			grade = 'A';
		}
		else if(score>=80&&score<90) {
			grade = 'B';
		}
		else if(score>=70&&score<=80) {
			grade = 'C';
		}
		else if(score>=60&&score<=70) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		switch(grade) {
		case 'A':
			System.out.printf("당신의 성적은 %c 입니다",grade);
			break;
		case 'B':
			System.out.printf("당신의 성적은 %c 입니다",grade);
			break;
		case 'C':
			System.out.printf("당신의 성적은 %c 입니다",grade);
			break;
		case 'D':
			System.out.printf("당신의 성적은 %c 입니다",grade);
			break;
		case 'F':
			System.out.printf("당신의 성적은 %c 입니다",grade);
		}
		
		

	}

}
