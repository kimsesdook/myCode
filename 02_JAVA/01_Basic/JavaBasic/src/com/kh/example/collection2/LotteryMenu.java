package com.kh.example.collection2;

import java.util.HashSet;
import java.util.Scanner;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("========== KH 추첨 프로그램 ==========");
		System.out.println("***** 메인 메뉴 *****");
		System.out.println("1. 추첨 대상 추가 ");
		System.out.println(" 2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인 ");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색 ");
		System.out.println("9.종료");
		System.out.print("메뉴 번호 입력 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1 :
			insertObject();
			break;
		case 2 :
			deleteObject();
			break;
		case 3 :
			winObject();
			break;
		case 4:
//			sortedWinObject();
			break;
		case 5 :
			searchWinner();
			break;
		case 9 :
			System.out.println("프로그램 종료");
			return;
		default :
			System.out.println("잘못 입력");
		}
		System.out.println();
			
		}

  
        
	}
	public void insertObject() {
		System.out.println("추가 할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("폰 번호 : ");
			String phone = sc.nextLine();
			boolean isIn = lc.insertObject(new Lottery(name, phone));
			if(!isIn) {
				System.out.println("중복된 인원입니다. 다시 입력해줘");
				i--;
			}
		}
		System.out.println(num+ "명 추가 완료됨.");
	}
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 번호 입ㄹ력");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("폰 : ");
		String ph = sc.nextLine();
		
		boolean is = lc.deleteObject(new Lottery(name,ph));
		if(is) {
			System.out.println("삭제 완료");
			
		}else {
			System.out.println("존재 안함");
		}
	}
	
	public void winObject() {
		HashSet win = lc.winObject();
		System.out.println(win);
	}
	public void searchWinner() {
		System.out.println("검색 대상 정보 입력");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("폰 : ");
		String ph = sc.nextLine();
		
		boolean is = lc.searchWinner(new Lottery(name, ph));
		if(is) {
			System.out.println("축하합니다 존재한다");
		}else {
			System.out.println("당첨자 목록에 존재 안합니다.");
		}
	}

}
