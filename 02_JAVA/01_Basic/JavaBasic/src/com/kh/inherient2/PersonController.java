package com.kh.inherient2;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		//학생수
		int stcount = 0, empcount=0;
		for(Student st : s) {
			if(st==null) {
				break;
			}
			stcount++;
		}
		//사원수
		for(Employee emp : e) {
			if(emp==null) {
				break;
			}
			empcount++;
		}
		return new int [] {stcount,empcount};

	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i=0;i<s.length;i++) {
			if (s[i]==null){
				s[i]=new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	public Student[] printStudent() {
		return s;

	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i=0;i<e.length;i++) {
			if (e[i]==null){
				e[i]=new Employee(name, age,height, weight,salary, dept);
				break;
			}
		}
	}
	public Employee[] printEmployee() {
		return e;

	}

}
