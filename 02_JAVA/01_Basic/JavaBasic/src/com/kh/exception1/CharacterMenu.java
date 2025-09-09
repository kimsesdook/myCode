package com.kh.exception1;

import java.util.Scanner;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	CharacterController ch = new CharacterController();
	public void menu() {
	
		System.out.print("문자열 : ");
		String s = sc.nextLine();
		try{
			ch.countAlpha(s);
			System.out.printf("%s에 포함된 영문자 개수 : %d",s,ch.countAlpha(s));
			
		}catch(CharCheckException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
