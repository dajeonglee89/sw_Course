package com.exam;

public class Ex4 {

	public static void main(String[] args) {
		// String ��ü���� = �Һ���ü(��ü ������ ������ ����)
		String str = "Java Programming";		
		
		//String �޼ҵ�
		System.out.println(str.length());
				
		// ���ڿ� ��
		if("Java Programming".equals(str)) {
			System.out.println("���ڿ� ����");
		}
		
		// ���ڿ� �������� 
		System.out.println(str.charAt(5));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,8));
		System.out.println("���ڿ� ���� : " + str.concat("!!!"));
		System.out.println("���ڿ� ��ü : " + str.replace("Java", "JSP"));
		System.out.println("������ġ : " + str.indexOf('a'));
		System.out.println("���ڿ���ġ : " + str.indexOf("gram"));
		System.out.println("���ڿ���ġ : " + str.lastIndexOf("a"));
		System.out.println("���ڿ� ���Կ��� : " + str.contains("gram"));
		System.out.println("�빮�� ��ȯ : " + str.toUpperCase());
		System.out.println("�ҹ��� ��ȯ : " + str.toLowerCase());
		
		String[] strArr = str.split(" "); // ���ڿ� �и��ؼ� �迭�� ����
		System.out.println("���ڿ��и� : " + strArr[0]);
		
		//�ֹι�ȣ -> �������� 1,2�� / 2,4��
		String ju = "890514-2345678";

		//int index, ���� ���� �� �ε���
		
//		int index = ju.indexOf('-') + 1;
			
		//�������й��� ��������. charAt() substring()
//		char ch = ju.charAt(index + 1);
		
		char ch = ju.charAt(ju.indexOf('-') + 1);
		
		String s = ju.substring(7,8);
		//���� �ݺ� index ��� (index = "-" ��° �ε���)
	
		// if �� char ==   String .equals()
		// ���� ���
		if(ch == '1' || ch == '3'){
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		
//		if(s.equals("1") || s.equals("3")) {
//			System.out.println("��");
//		}else {
//			System.out.println("��");
//		}
//	
		
	} //main

}
