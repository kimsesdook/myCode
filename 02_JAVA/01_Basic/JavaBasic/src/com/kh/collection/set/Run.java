package com.kh.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {
	/*
	 * Set
	 * 순서가 없고, 중복을 허용하지 않는 자료구조
	 * index개념이 없어서 위치기반 접근(get(index))이 불가.
	 *  - HashSet : 일반적인 해시 알고리즘이 적용된 set
	 *  - LinkedHashSet : hashset + 순서를 유지
	 *  -treeSet : 자동정령 기능 제공
	 *  
	 */

	public static void main(String[] args) {
		// 생성
		Set<Human> set = new HashSet<>();
		
		//데이터추가
		set.add(new Human("김정훈", 12));
		set.add(new Human("김정훈", 22));
		set.add(new Human("김훈", 32));
		set.add(new Human("정훈", 42));
		System.out.println(set);
		//set에 저장해서 사용하는 객체(Human)은 equals와 hashCode를 오버라이딩 해줘야 한다.
		//set은 hash코드로 분류 후 equals()로 비교해서 중복값을 검사함.
		set.add(new Human("김훈", 32));
		set.add(new Human("정훈", 42));
		System.out.println(set); // 동일 객체는 추가가 되지 않음.
		
		Human h2 = new Human("김정훈",22);
		//동일 객체 : equals, hashcode가 동일해야 함
		// 객체마다의 정의된 hashcode와 equals의 결과가 모두 일치하는 객체
		//equals와 hashcode를 오버라이딩 하지 않으면 object외 equals와 hashcode를 사용함
		//object의 equals - > 주소값 비교
		//object의 hashcode -> 주소값을 가지고 10진수 형태의 해시값을 구한것
		
		//Contains()요소에 포함여부를 확인
		System.out.println("김정훈이 존재? : "+ set.contains(h2));
		
		//remove(E e) 요소를 통해 요소제거
		set.remove(h2);
		System.out.println("삭제 후 : "+ set);
		
		System.out.println("size : "+set.size());
		
		//set의 모든 요소에 순차적으로 접근하는 방법
		//set은 index개념이 없기 때문에 get()사용 불가
		
		//1.for-each
		for(Human h : set) {
			System.out.println(h);
		}
		//2. ArrayList에 담아서 반복-> addAll(Collection e)
		ArrayList<Human> list = new ArrayList<>();
		list.addAll(set);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Iterator(반복자 인터페이스)를 활용
		//컬렉션에 저장된 요소를 순차적으로 접근하기 위한 인터페이스
		//순서가 없는 Set같은 자료구조를 탐색할 때 반드시 필요
		//hasNext() : 다음 잀을 요소가 있으면 true, 없으면 false
		//next() : 다음 요소를 반환
		Iterator<Human> it = set.iterator();
		while(it.hasNext()) {
			Human h = it.next(); // 다음 요소 꺼내기
			System.out.println(h);
		}
		
		


	}

}
