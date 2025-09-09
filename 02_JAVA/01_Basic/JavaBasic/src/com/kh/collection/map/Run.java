package com.kh.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {
	/*
	 * Map
	 * key와 value를 쌍으로 저장하는 자료구조
	 * key는 중복불가, value는 중복 가능
	 * HashMap(가장 보편적이고 속도향상), LinkedHashMap(입력순서보장), TreeMap(정렬된 key순서 유지)
	 */

	public static void main(String[] args) {
		Map<Integer, Human> hmap = new HashMap<>();
		
		//1. put() map에 key,value쌍으로 값을 추가
		hmap.put(10, new Human("김정훈", 20));
		hmap.put(20, new Human("김정투", 30));
		hmap.put(30, new Human("김정삼", 40));
		hmap.put(40, new Human("김정사", 50));
		hmap.put(10, new Human("김정훈", 20)); // 동일한 key사용시 값을 덮어씀
		System.out.println(hmap); // 저장되는 순서 유지 안됨
		
		//2. get(key) 해당 키값을 가지는 value를 반환
		System.out.println(hmap.get(30));
		
		//3.size() 담겨있는 객체 수
		System.out.println("size : "+hmap.size());
		
		//4. remove(key) 해당 키의 값을 찾아서 쌍으로 제거
		hmap.remove(40);
		System.out.println(hmap);
		
		//map에 전체 요소를 탐색하는 방법
		//Iterator 이용x
		//for each 이용 x
		
		//다른 자료구조로 변경 후 반복하면 됨
		//1. key를 모아서 set자료구조 형태로 반혼
		Set keyset =hmap.keySet(); // 모든 key를 set에 담아서 반환
		System.out.println(keyset);
		for(Object key : keyset) {
			System.out.println("키 : "+key + "값 : "+ hmap.get(key));
		}
		
		//2. entetSet을 이용한 전체 탐색
		//map은 key와 value를 쌍으로 저장하기 때문에 단순하게 keyset(), value()만으로
		//한번에 key와 값을 가져올 수 없음.
		//Set<Map.Entry<K,V>>
		Set entrySet = hmap.entrySet();
		for(Object entry : entrySet) {
			Entry e = (Entry)entry;
			System.out.println(e.getKey()+" "+e.getValue());
		}


	}

}
