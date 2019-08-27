package com.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Puppy{
	int age;


	public Puppy(int age) {
		super();
		this.age = age;
	}


	void speak() {
		System.out.println(age + "살 강아지 냐옹냐옹냐옹");
	}
}


public class Ex4 {

	public static void main(String[] args) {
		// 제네릭(Generic) : 타입 파라미터 (매개변수)
		// -> 컬렉션에 저장되는 요소의 타입을 지정. 
		List<Object> list = new ArrayList<Object>();  //정수값

		list.add("홍길동");
		list.add(20); //오토박싱 Integer타입
		list.add(new Puppy(3));
		list.add(new Puppy(5));

		//인덱스 위치 요소를 가져오기 
		String str = (String) list.get(0); //object -> string 형변환
		System.out.println(str);

		//		double dNum = (Double) list.get(0);

		Integer num = (Integer) list.get(1); // Object -> Integer 형변환
		System.out.println(num);

		Puppy puppy = (Puppy) list.get(2);
		puppy.speak();

		System.out.println("============");

		List<Puppy> puppyList = new ArrayList<Puppy>();

		//		puppyList.add("문자열");
		puppyList.add(new Puppy(1));
		puppyList.add(new Puppy(2));
		puppyList.add(new Puppy(3));
		puppyList.add(new Puppy(4));
		puppyList.add(new Puppy(5));

		Puppy p = puppyList.get(1);
		p.speak();

		System.out.println("===========");

		for(int i=0; i<puppyList.size(); i++) {
			Puppy pupp = puppyList.get(i);
			pupp.speak();
		}

		System.out.println("===========");

		for( Puppy pup : puppyList) {
			pup.speak();
		}


		System.out.println("===========");

		// Iterator 반복자 : Set, List 타입 객체에서 Iterator 가져오기 가능.

		Iterator<Puppy> it = puppyList.iterator();

		while(it.hasNext()) {
			Puppy p3 = it.next();
			p3.speak();
		}





	}//main

}
