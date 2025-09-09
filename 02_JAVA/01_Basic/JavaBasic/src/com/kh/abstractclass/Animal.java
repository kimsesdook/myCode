package com.kh.abstractclass;

public abstract class Animal {
	//일반 메서드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메서드
	public abstract void speak(); //소리내기
	public abstract void move(); //움직이기

}
