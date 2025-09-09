package com.kh.polymorphism;

public class Avante extends Car{

	public Avante(String color, String fuel, int year) {
		super(color, fuel, year);
	}
	
	public void drive() {
		System.out.println("부아앙");
	}
	public void moveAvante() {
		System.out.println("빵 아반떼");
	}
	//매개변수에 부모타입 참조변수를 사용하면 모든 자식타입을 받을 수 있음
	public void driveCar(Car car) {
		// 매개변수로 넘어온 car가 실제 메모리 공간에 avante를 구현하고 있어야 moveavante 사용가능
		if(car instanceof Avante) {
			((Avante)car).moveAvante();
		}
		
	}
	public boolean equals(Object obj) {
		if(obj instanceof Avante) {
			
		}
		return false;
	}

}
