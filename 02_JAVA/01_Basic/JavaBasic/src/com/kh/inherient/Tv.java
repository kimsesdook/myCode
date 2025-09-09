package com.kh.inherient;

public class Tv extends Product {
	private int inch;

	public Tv() {
		super();
	}

	public Tv(String pName, int price, String brand, int inch) {
		super(pName, price, brand);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	@Override
	public String inform() {
		return super.inform()+ " /인치 : " + inch;
	}
	

}
