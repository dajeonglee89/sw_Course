package com.exam;

public class Ex6 {


	public void methodA(int num) throws Exception{		
		//�Ű����� num�� ������ ������ �Ұ����� ����
//		if(num<0) {
//			System.out.println("num�� �����Դϴ�");
//			return;
//		}
				
		// num�� �����϶� ���ܸ� ���������� �߻���Ű��
		if(num < 0) {
			throw new Exception("num���� �����Դϴ�.");
		}
		
		System.out.println("num = " + num);
		
	}
	


	public static void main(String[] args) {
		System.out.println("===���α׷� ����===");
		
		Ex6 ex = new Ex6();
		try {
			ex.methodA(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("===���α׷� ����===");

	} //main

}
