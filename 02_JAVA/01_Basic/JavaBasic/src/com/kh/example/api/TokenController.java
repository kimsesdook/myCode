package com.kh.example.api;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str,"' '");
		StringBuilder sb = new StringBuilder();
		int size = st.countTokens();
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		return sb.toString();
	}
	public String firstCap(String input) {
		String s = "";
		s=input.substring(0, 1).toUpperCase()+input.substring(1);
		return s;
	}
	public int findChar(String input, char one) {
		int count = 0;
		char [] c = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			if(c[i]==one) {
				count++;
			}
		}
		return count;
	}
	

}
