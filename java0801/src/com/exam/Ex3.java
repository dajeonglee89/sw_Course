package com.exam;

class ObjectTest /*extends Object*/{
	
}



public class Ex3 {

	public static void main(String[] args) {
		// Object : java.lang.Object
		// �ֻ��� Ŭ����. ��� Ŭ������ Object ��ӹ���.
		// Ŭ������ �������� �κ� ����. �θ�Ŭ����.
		// ��� Ŭ������ extends Object ����. 

		ObjectTest ot = new ObjectTest();
		// ���� ��ü�� ��Ÿ�� Ŭ������ ������
		System.out.println(ot.getClass());
		System.out.println(ot);
		
		// ���� ��ü�� ���� ���ڿ� ǥ���� ������.
		System.out.println(ot.toString());
		System.out.println(ot);
		
		
		int a = 10, b=10;
		if(a==b) {
		  System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		
		String str1 = "�ȳ�";
		String str2 = "�ȳ�";
		if(str1 == str2) { //�����ּҸ� ����
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		
		String str3 = new String("�ȳ�");
		String str4 = new String("�ȳ�");
		if(str3 == str4) { //�����ּҸ� ����
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		
		
	} //main

}
