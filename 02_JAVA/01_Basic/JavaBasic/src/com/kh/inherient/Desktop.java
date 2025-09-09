package com.kh.inherient;

public class Desktop extends Product {
	private boolean allinOne; // 일체형 여부

	public Desktop() {
		
	}

	public Desktop(String pName, int price, String brand, boolean allinOne) {
		super(pName, price, brand);
		this.allinOne = allinOne;
	}

	public boolean isAllinOne() {
		return allinOne;
	}

	public void setAllinOne(boolean allinOne) {
		this.allinOne = allinOne;
	}
	//오버라이딩
	//-> 부모클래스에 있는 메서드를 자식클래스에서 내용만 재정의 하는 것
	@Override
	public String inform() {
		return super.inform()+ " /올인원 : " + allinOne;
	}
	

}
