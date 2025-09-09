package com.kh.example.collection;

import java.util.Comparator;

public class AscTitle implements Comparator{
	public int compare(Object o1, Object o2) {
		
		return (Music)o1.title - (Music)o2.title
	}

}
