package com.kh.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {
	/*
	 * 네트워크 : 여러대의 컴퓨터들이 연결되어 있는 통신망
	 * 
	 * Ip 주소 : 네트워크 상에 각 컴퓨터들을 식별할 수 있는 주소
	 * port : 컴퓨터에서 응용프로그램을 식별하기 위한 코드
	 * 
	 * 서버-클라이언트 연결방식
	 * 클라이언트 : 서버에 요청을 보내는 컴퓨터(서비스를 제공받는 고객)
	 * 서버 : 클라이언트의 요청을 받아서 고객에게 서비스를 제공해주는 프로그램 또는 컴퓨터(요청을 받아서 응답하는 것)
	 * 
	 * 도메인 : 특정 서버에 접근하기 위한 정보(ip,port)를 사람이 읽고 기억하기 어려움 -> 쉽게 만든 주소
	 *       -> 실제 도메인으로 요청시 dns에서 ip로 변경해서 위치를 찾음
	 * 
	 * *서버에 요청을 보내기 위해서는 요청하고자 하는 서버의 ip주소, port번호를 알아야 함.
	 */
	
    // InetAddress : 네트워크 정보를 확인할 수 있는 객체
	public static void main(String[] args) {
		InetAddress localhost;
		try {
			localhost = InetAddress.getLocalHost();
			System.out.println(localhost); // 내 pc명 +내 ip주소(내부 아이피)
			
			System.out.println("내 pc명 : " + localhost.getHostAddress());
			System.out.println("내 ip주소 : "+localhost.getHostName());
			System.out.println("=====================================");
			
			localhost = InetAddress.getByName("www.google.com");
			System.out.println(localhost);	
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
