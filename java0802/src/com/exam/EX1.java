package com.exam;

public class EX1 {

	public static void main(String[] args) {
		// Wrapper - Ŭ����
		// Byte, Short, Integer, Long - ������
		// Float, Double - �Ǽ�
		// Character - ������
		// Boolean - ��


		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// Wrapper Ÿ�� ��ü ����
		Integer i= Integer.valueOf(10);
		Integer i2= Integer.valueOf("10");

		System.out.println(i.toString());

		Character c = Character.valueOf('c');
		Boolean b = Boolean.valueOf(true);

		//���ڿ� ���ͷ��� ������ �ش� Ÿ������ ��ȯ��. 
		Double d = Double.valueOf("3.14");

		//Wrapper ��ü�� ����ִ� �⺻Ÿ�� �� �������� 
		int ii = i.intValue();
		System.out.println(ii);

		boolean bb = b.booleanValue();
		double dd = d.doubleValue();
		System.out.println(bb);
		System.out.println(dd);




		System.out.println("=============");

		// ���ڿ��� �⺻Ÿ������ ��ȯ�ڡڡڡڡڡڡڡڰ̳��߿�
		int iii = Integer.parseInt("123");
		double ddd = Double.parseDouble("3.14");
		boolean bbb = Boolean.parseBoolean("true");
		System.out.println(bbb);
		System.out.println(ddd);
		System.out.println(iii);
		
		
		
		
		// �⺻Ÿ�� ���� ���ڿ��� ��ȯ
		String s1 = Integer.toString(123); //"123"
		String s2 = Integer.toBinaryString(3); // 2���� ���ڿ� 
		System.out.println(s2);
		String s3 = Integer.toOctalString(8); // 8���� ���ڿ�
		System.out.println(s3);
		String s4 = Double.toString(3.14);
		System.out.println(s4);
		
		
		// ���� �ڽ�
		Integer ten1 = Integer.valueOf(10);
		// ���� ��ڽ�
		int num1 = ten1.intValue();
		
		ten1 = Integer.valueOf(i.intValue() + i2.intValue());


		// �ڵ� �ڽ�
		Integer ten2 = 10;
		// �ڵ� ��ڽ�
		int num2 = ten2;
		
		ten2 = i + i2;




	}//main

}
