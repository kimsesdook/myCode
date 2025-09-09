package com.kh.jdbc.v;

import java.util.Scanner;

import com.kh.jdbc.c.MusinsaController;

public class MusinsaView {
	
	private Scanner sc = new Scanner(System.in);
	private MusinsaController mc = new MusinsaController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("==무신사에 접속하신것을 환영합니다.==");
		System.out.println("1.회원가입");
		System.out.println("2.가입 정보");
		System.out.println("3.정보 업데이트");
		System.out.println("4.남은 쿠폰 갯수");
		System.out.println("5.회원 탈퇴");
		System.out.println("9.로그아웃");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: insert(); break;
		case 2: mc.select(); break;
		case 3: update(); break;
		case 4: mc.couponCount(); break;
		case 5: delete(); break;
		case 9: System.out.println("앱을 종료하겠습니다.");return;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		System.out.println();
		}
		

	}
	public void insert() {
		System.out.println("이름 :");
		String name = sc.nextLine();
		
		System.out.println("나이 :");
		String age = sc.nextLine();
		
		mc.insert(name,age);
	}
	public void update() {
		System.out.println("기본 이름 :");
		String name = sc.nextLine();
		
		System.out.println("변경할 이름 : ");
		String reId = sc.nextLine();
		
	
		
		mc.update(name,reId);
	}
	public void delete() {
		System.out.println("삭제 이름 :");
		String id = sc.nextLine();
		
		mc.insert(id);
	}
	
	public void complete(String title) {
		System.out.println(title + "\n성공적으로 완료 됐습니다.");
	}
	public void fali(String title) {
		System.out.println(title + "\n실패 입니다.");
	}

}
