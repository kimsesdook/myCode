package com.kh.example.oop7;

import java.util.Scanner;

public class ProductMenu {
	ProductController pc = new ProductController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int number = 0;
		while(number!=9) {
		System.out.println("====== 상품 관리 메뉴 ======");
		System.out.println("1. 상품추가");
		System.out.println("2. 상품 전체 추가");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
	    number = sc.nextInt();
	    sc.nextLine();
	    switch(number) {
	    case 1:
	    	System.out.print("추가할 상품명 : ");
	    	String n = sc.next();
	    	System.out.print("추가할 가격 : ");
	    	int p = sc.nextInt();
	    	sc.nextLine();
	    	System.out.print("추가할 브랜드 : ");
	    	String b = sc.next();
	    	pc.insertProduct(n,p,b);
	    	break;
	    case 2 :
	    	Product[] q = pc.selectProduct();
	    	for(Product a : q) {
	    		if(a==null) {
	    			break;}
	    		else {
	    			System.out.println(a.inform());
	    		}
	    	}
	    	
	    	break;
	    case 9 : 
	    	System.out.println("프로그램을 종료합니다.");
	    	break;
	    default:
	    	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
	    }
	    
		}
	}

}
