package com.kh.inherient;

public class Man {
	private String name;

	public Man() {
		super(); 
		System.out.println("man의 기본 생성자");
	}

	public Man(String name) {
		super(); // object의 생성자
		this.name = name;
		System.out.println("Man의 name이 포함된 생성자 : "+ name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void tellYourName() {
		System.out.println("My name is" + name);
	}

}
