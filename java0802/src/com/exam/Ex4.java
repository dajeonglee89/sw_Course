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
		System.out.println(age + "�� ������ �Ŀ˳Ŀ˳Ŀ�");
	}
}


public class Ex4 {

	public static void main(String[] args) {
		// ���׸�(Generic) : Ÿ�� �Ķ���� (�Ű�����)
		// -> �÷��ǿ� ����Ǵ� ����� Ÿ���� ����. 
		List<Object> list = new ArrayList<Object>();  //������

		list.add("ȫ�浿");
		list.add(20); //����ڽ� IntegerŸ��
		list.add(new Puppy(3));
		list.add(new Puppy(5));

		//�ε��� ��ġ ��Ҹ� �������� 
		String str = (String) list.get(0); //object -> string ����ȯ
		System.out.println(str);

		//		double dNum = (Double) list.get(0);

		Integer num = (Integer) list.get(1); // Object -> Integer ����ȯ
		System.out.println(num);

		Puppy puppy = (Puppy) list.get(2);
		puppy.speak();

		System.out.println("============");

		List<Puppy> puppyList = new ArrayList<Puppy>();

		//		puppyList.add("���ڿ�");
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

		// Iterator �ݺ��� : Set, List Ÿ�� ��ü���� Iterator �������� ����.

		Iterator<Puppy> it = puppyList.iterator();

		while(it.hasNext()) {
			Puppy p3 = it.next();
			p3.speak();
		}





	}//main

}
