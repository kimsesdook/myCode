package com.kh.example.oop6;

public class StudentMenu {
	StudentController ssm = new StudentController();

	public StudentMenu() {
		Student [] stArr = ssm.printStudent();
		System.out.println("==========학생 정보 출력==========");
		for(Student st : stArr) {
			if(st == null) {
				break;
			}
			System.out.println(st.inform());
		}
		System.out.println("==========학생 성적 출력==========");
		double[] scoreav = ssm.avgScore();
		System.out.println(scoreav[0]);
		System.out.println(scoreav[1]);
		
		System.out.println("==========성적 결과 출력==========");
		for(Student st : stArr) {
			if(st.getScore()<ssm.CUT_LINE) {
				System.out.println(st.getName()+"재시험 대상");
			}else {
				System.out.println(st.getName()+"통과");
			}
		}



	}
	

}
