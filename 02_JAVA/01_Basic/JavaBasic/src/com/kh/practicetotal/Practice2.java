package com.kh.practicetotal;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//내가 짠 코드		
//		String in = sc.next();
//		boolean t = false;	
//		for(int i=0;i<in.length()/2;i++) {
//			if(in.charAt(i)!=in.charAt((in.length()-1)-i)){
//				t = true;
//				break;
//			}
//			
//		}
//		
//		if(t==true) {
//			System.out.println(0);
//		}else  {
//			System.out.println(1);
//		}
		
		String str = sc.next();
		boolean ok = true;
		for(int i=0,j=str.length()-1; i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				ok=false;
				break;
			}
				
		}
		System.out.println(ok?1:0);
	}

}
