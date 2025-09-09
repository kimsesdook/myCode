package com.kh.inherient2;

import java.util.Scanner;

public class PersonMenu {
	 private Scanner sc = new Scanner(System.in);
	 private PersonController pc = new PersonController();
	 
	 public void mainMenu() {
		 //0 -> 학생수, 1-> 사원수
		 int[] count = pc.personCount();
		 while(true) {
		 System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		 System.out.println("현재 저장된 학생은"+ count[0] +"명입니다.");
		 System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		 System.out.println("현재 저장된 사원은"+ count[1] +"명입니다.");

		 System.out.println("1. 학생메뉴");
		 System.out.println("2. 사원메뉴");
		 System.out.println("9. 끝내기");
		 System.out.print("메뉴 번호 : ");
		 int n = sc.nextInt();
		 switch(n) {
		 case 1 :
			 studentMenu();
				 break;
		 case 2 :
			 employeeMenu();
			 break;
		 case 9 :
			 System.out.println("종료합니다. ");
			 return;
		 default :
			 System.out.println("잘못 입력하셨습니다.");
		 }
		 }
	 }
	 public void studentMenu() {
		 while(true) {
		 System.out.println("1. 학생추가");
		 System.out.println("2. 학생보기");
		 System.out.println("9. 메인으로");
		 System.out.print("메뉴 번호 : ");
		 int n = sc.nextInt();
		 
		 switch(n) {
		 case 1 :
			 insertStudent();		
			 break;
		 case 2 :
			 printStudent();
			 break;
		 case 9 :
			 System.out.println("메인으로");
			 return;
		 default :
			 System.out.println("잘못 입력하셨습니다.");
		 }
		 }
	 }
		 
	 public void employeeMenu() {
		 while(true) {
		 System.out.println("1. 사원추가");
		 System.out.println("2. 사원보기");
		 System.out.println("9. 메인으로");
		 System.out.print("메뉴 번호 : ");
		 int n = sc.nextInt();
		 
		 switch(n) {
		 case 1 :
			 insertStudent();		
			 break;
		 case 2 :
			 printStudent();
			 break;
		 case 9 :
			 System.out.println("메인으로");
			 return;
		 default :
			 System.out.println("잘못 입력하셨습니다.");
		 }
		 } 
	 }
	 public void insertStudent() {
		 if(pc.personCount()[0]>=3) {
			 System.out.println("학생을 담을 공간이 없엎메뉴로 돌아감");
			return;
		 }
		 while(true) {
	
		 System.out.println("학생 이름 : ");
		 String name = sc.next();
		 System.out.println("학생 나이 : ");
		 int age = sc.nextInt();
		 System.out.println("학생 키 : ");
		 double k = sc.nextDouble();
		 System.out.println("학생 몸무게 :");
		 double m = sc.nextDouble();
		 System.out.println("학생 학년 : ");
		 int h = sc.nextInt();
		 System.out.println("학생 전공 : ");
		 String ma = sc.next();
		 
		 pc.insertStudent(name, age, k, m, h, ma);
		 
		 if(pc.personCount()[0]>=3) {
			 System.out.println("학생을 담을 공간이 없엎메뉴로 돌아감");
			 break;
		 }
		 
		 System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
		 char an = sc.next().toUpperCase().charAt(0);
		 if(an == 'N') break;
	 }
	 }
	 public void printStudent() {
		 Student[] arr = pc.printStudent();
		 for(Student st : arr) {
			 if(st==null) break;
			 System.out.println(st.toString());
		 }
	 }
	 public void insertEmployee() {
		 if(pc.personCount()[1]>=10) {
			 System.out.println("사원을 담을 공간이 없엎메뉴로 돌아감");
			return;
		 }
		 while(true) {
	
		 System.out.println("사원 이름 : ");
		 String name = sc.next();
		 System.out.println("사원 나이 : ");
		 int age = sc.nextInt();
		 System.out.println("사원 키 : ");
		 double k = sc.nextDouble();
		 System.out.println("사원 몸무게 :");
		 double m = sc.nextDouble();
		 System.out.println("사원 급여 : ");
		 int h = sc.nextInt();
		 System.out.println("사원 부서 : ");
		 String ma = sc.next();
		 
		 pc.insertEmployee(name, age, k, m, h, ma);
		 
		 if(pc.personCount()[1]>=3) {
			 System.out.println("사원을 담을 공간이 없엎메뉴로 돌아감");
			 break;
		 }
		 
		 System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
		 char an = sc.next().toUpperCase().charAt(0);
		 if(an == 'N') break;
	 }
	 }
	 public void printEmployee() {
		 Employee[] arr = pc.printEmployee();
		 for(Employee st : arr) {
			 if(st==null) break;
			 System.out.println(st.toString());
		 }
	 }


}
