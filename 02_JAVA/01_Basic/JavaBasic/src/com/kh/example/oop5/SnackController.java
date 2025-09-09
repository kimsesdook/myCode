package com.kh.example.oop5;

public class SnackController {
	private Snack s = new Snack();
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장이 완료됨";
	}
	
	public String confirmData() {
		return s.information();
	}

}
