package com.kh.example.collection;

import java.util.Objects;

public class Music implements Comparable {
	private String title;
	private String signal;
	public Music() {
		super();
	}
	public Music(String title, String signal) {
		super();
		this.title = title;
		this.signal = signal;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSignal() {
		return signal;
	}
	public void setSignal(String signal) {
		this.signal = signal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(title, signal);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music m = (Music)obj;
			if(this.title.equals(m.getTitle())&&this.signal.equals(m.getSignal()));
		}
		return false;
	}
	@Override
	public String toString() {
		return signal + "-"+title;
	}
	
	
	

}
