package com.kh.example.oop3;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("너와의미","교보문고", "강의운");
		Book b3 = new Book("릴리마","부명", "강신가",25000,0.8);
		
		b1.inform();
		b2.inform();
		b3.inform();

	}

}
