package com.kh.example.poly1;

public class AnimalManager {

	public static void main(String[] args) {
		Animal [] a = new Animal[5];
		a[0] = new Dog("푸름", 20,"진돗개" );
		a[1] = new Dog("백구", 15," 불독");
		a[2]=  new Cat("야옹이", 8, "보라색");
		a[3]=  new Cat("찡글이", 5, "흰색");
		a[4]=  new Dog("땡구", 2, "잡종");
		
		
		for(Animal n : a) {
			if(n instanceof Dog) {
				n.speak();
				System.out.printf("이 개의 견종은 %s 입니다.\n",((Dog)n).getBreed());
			}else {
				n.speak();
				System.out.printf("이 고양이의 색상은 %s 입니다.\n",((Cat)n).getColor());
			}
		}

	}

}
