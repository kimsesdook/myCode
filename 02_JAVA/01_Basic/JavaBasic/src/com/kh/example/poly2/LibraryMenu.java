package com.kh.example.poly2;

import java.util.Scanner;

public class LibraryMenu {
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController ();
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		Member m = new Member(name, age, gender);
		lc.insertMember(m);
		
		while(true) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 전체 조회");
			System.out.println("3.도서 검색");
			System.out.println("4.도서 대여하기");
			System.out.println("9.프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				Member mem = lc.myInfo();
				if(m!=null) {
					System.out.println(mem);
				}
				break;
			case 2 :
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4 :
				rentBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	public void selectAll() {
		Book[] b = lc.selectAll();
		for(int i=0;i<b.length;i++) {
			if(b[i]==null)
				break;
			System.out.println(i+"번 도서 : "+ b[i]);
		}
	}
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String k = sc.next();
		Book [] b =lc.searchBook(k);
		if(b[0]==null) {
			System.out.println("검색 결과가 없음");
		}else {
		for(Book c :b) {
			if(c==null)
				break;
			System.out.println(c);
		}
	}
	}
	public void rentBook() {
		Book[] b = lc.selectAll();
		int result = 0;
		for(int i=0;i<b.length;i++) {
			System.out.println(i+"번 도서 : "+b[i]);
		}
		System.out.print("대여할 도서 번호 선택 : ");
		int num  = sc.nextInt();
		result =lc.rentBook(num);
		switch(result) {
		case 0 :
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1 :
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2 :
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
			break;
		default:
		}
	}

}
