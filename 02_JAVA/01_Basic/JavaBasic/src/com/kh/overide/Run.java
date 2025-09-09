package com.kh.overide;

public class Run {
	/*
	 * 참조변수를 호출하면 자동으로 .toString()이 호출됨
	 * -> object에 정의된 메서드로 모든 클래스는 object를 상속받아 toString()을 사용할 수 있음.
	 * 
	 * 오버라이딩 전(Object) toString() : 클래스명 +@+객체주소의 hashCode를 16진수로 반환
	 * 오버라이딩 후(MAn) toString() : 내가 원하는 형식의 구조로 재정의
	 * *오버라이딩
	 * - 자식클래스가 상속받고 잇는 부모클래스의 메서드를 재정의 하는 것
	 * - 부모가 제공하는 메서드를 자식이 일부 수정해서 사용하겠다는 의미
	 * 
	 * *오버라이딩 성립조건
	 * - 부모메서드명과 메서드명이 동일
	 * - 매개변수의 갯수, 자료형, 순서를 포함
	 * - 반환형도 동일해야함.
	 * - 부모메서드의 접근 제한자보다는 범위가 같거나 커야 함.
	 * 
	 */

	public static void main(String[] args) {
		String str1 = new String("김정훈");
		String str2 = new String("김정훈");
		Man m1 = new Man("김정훈", "4564231");
		Man m2 =  new Man("김정훈", "4564231");
		
		System.out.println(m2);
		System.out.println(m1);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
		System.out.println(m1.equals(m2));
		
	}

}
