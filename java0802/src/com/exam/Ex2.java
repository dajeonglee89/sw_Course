package com.exam;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		// �÷��� : �ڷᱸ��, �������
		// set : HashSet �������� ����Ÿ�� �������
		//       ��������� ���� -> �ߺ����� �Ұ���
		// List : ArrayList, Vector
		//        �����ִ� ����Ÿ�� �������
		//        ��������� ���� -> �ߺ����� ����
		// Map : HashMap, Hashtable
		//       (Ű, ��) ������ ����.
		//       Ű�� �̿��ؼ� ���� ���� �ڷᱸ��
		
		
		
		// �ʿ� Ű�� ����Ҷ� ���� �� 
		Set set = new HashSet();
		
		System.out.println(set.isEmpty()); //true
		
		set.add("�ϳ�");
		set.add(1); // set.add(Integer.valueOf(i)); //����ڽ�(int->Integer)
		set.add(2.5);
		set.add('��');
		System.out.println(set); 
		
		System.out.println(set.isEmpty()); //false

		set.remove(2.5);
		System.out.println(set);
		
		set.remove("�ϳ�");
		System.out.println(set);
		
		System.out.println(set.size()); //��Ұ��� 2
		
		System.out.println("contains : " + set.contains(1));
		
		set.clear();
		System.out.println(set.size()); //��Ұ��� 0 
		System.out.println(set);
		
				
	} // main

}
