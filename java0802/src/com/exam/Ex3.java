package com.exam;

import java.util.ArrayList;
import java.util.List;


public class Ex3 {

	public static void main(String[] args) {
		// List �������̽� ���� -> ArrayList, Vector
		// : ����ũ�� �迭
		List list = new ArrayList();
		
		System.out.println(list.size());
		
		list.add(1); // �ε���0��°
		list.add("��");
		list.add(3);
		list.add(3.14);
		list.add(1,'��'); // �ε��� 1��° ��ġ�� '��'�� ����
		
		System.out.println(list); //list.toString
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.contains(3.14));
		
		list.clear();
		System.out.println(list.size()); //��� ����0
		System.out.println(list);
		System.out.println(list.isEmpty()); //true
		

		
		
		
	} //main

}
