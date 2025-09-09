package com.kh.abstractNInterface.Phone;

public class Run {

	public static void main(String[] args) {
		PhoneController p =new PhoneController(); 
		String [] re = new String[2];
		re= p.method();
		for(int i=0;i<re.length;i++) {
			System.out.println(re[i]);
		}

	}

}
