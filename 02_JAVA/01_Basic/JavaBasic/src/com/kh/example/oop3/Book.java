package com.kh.example.oop3;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	public Book() {
		
	}
	public Book(String title, String publisher, String author) {
		this(title, publisher, author, 0,0);

	}
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	public void inform() {
		System.out.print(title+" ");
		System.out.print(publisher+" ");
		System.out.print(author+" ");
		System.out.print(price+" ");
		System.out.print(discountRate+" ");
	}
	
	

}
