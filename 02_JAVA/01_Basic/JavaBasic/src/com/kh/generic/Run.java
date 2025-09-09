package com.kh.generic;

public class Run {
	/*
	 * 제네릭
	 * 제네릭을 사용하지 않고 Object와 같은 넓은 범위를 수용할 수 있는 필드변수의 타입을 사용시 -> 형변환필요, 런타임 오류가 발생 할 수 있다.
	 * 클래스나 메서드가 사용할 데이터 타입을 컴파일 시점에 지정할 수 있도록 지원하는 문법 - > 매개타입(객체 생성시 타입을 전달받아 결정)
	 */

	public static void main(String[] args) {
		//제네릭 클래스의 매개타입을 전달하지 않으면 기본적으로 Object로 설정됨
		Box aBox = new Box<>();
		aBox.setValue("10"); // object로 전달받아서
		int num = (Integer)aBox.getValue(); // 반환시에도 오브젝트로 변환
		System.out.println(aBox.getValue());
		
		Box<Integer> iBox = new Box<>();
		//iBox.setValue(); 매개타입이 인티저니까 String전달 불가
		iBox.setValue(100);
		int num2 = iBox.getValue(); //형변환 불필요
		
		Integer[] arr = new Integer[5];
		iBox.setArr(arr);
		
		

	}

}
