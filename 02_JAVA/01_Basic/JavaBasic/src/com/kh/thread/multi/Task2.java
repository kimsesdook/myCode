package com.kh.thread.multi;

public class Task2 extends Thread{
    
	//20이하의 홓수 출력
	@Override
	public void run() {
		try {
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			Thread.sleep(100);
		}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
