package com.kh.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * - comparable : 객체 스스로 기본 정렬 기준 제공
 * - comparator : 필요할 때 외부에서 정렬 기준 주입
 */

public class Run {
	public static void main(String[] args) {
		List<Student>list = new ArrayList<>();
		list.add(new Student("철수",80,18));
		list.add(new Student("민수",90,15));
		list.add(new Student("지수",75,17));
		list.add(new Student("지수",65,16));
		list.add(new Student("영수",100,19));
		
		System.out.println("최초 저장 값 : ");
		System.out.println(list);
		
		//comparable : 학생에 정의된 기준으로 정렬(Student클래스의 compareTo기준)
		//점수 오름차순 -> 이름 오름차순 -> 나이 오름차순
		Collections.sort(list);
		System.out.println("정렬 후 :"+list);
		
		//외부 기준으로 이름 오름차순
		Collections.sort(list,new NameAscComparator());
		System.out.println("comparator 이름 오름차순 정렬 : ");
		System.out.println(list);
		
		//외부 기준으로 점수 내림차순
		Collections.sort(list,new ScoredescComparator());
		System.out.println("comparator 점수 내림차순 정렬 : ");
		System.out.println(list);
		
		//외부 기준으로 복합 내림차순
				Collections.sort(list,new ScoreDescAndNameAscComparator());
				System.out.println("comparator 복합 정렬 : ");
				System.out.println(list);

	}

}
