package com.exam;

public class Ex3 {

	public static int methodA() {
		try {
			String str = "���ڿ�";
			System.out.println("���ڿ� ����: " + str.length());
			return 10;			
		} finally {
			System.out.println("�����۾�����");
			/*
			 ����� ��ü �ڿ� �ݱ� ����
			 rs.close();
			 pstmt.close();
			 con.close(0; 
			 */
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("=== ���α׷� ���� ===");
		System.out.println(methodA());
		System.out.println("=== ���α׷� �������� ===");
		
	}

}
