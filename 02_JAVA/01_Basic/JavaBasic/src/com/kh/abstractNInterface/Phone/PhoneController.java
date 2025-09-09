package com.kh.abstractNInterface.Phone;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[2];
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		int index=0;
		for(Phone p1 : p) {
			if(p1 instanceof SmartPhone) {
			result[index++]=((SmartPhone)p1).printInformation();
			}
		}
		return result;
	}

}
