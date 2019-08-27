package com.exam;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// Math Ŭ���� 	
		System.out.println(Math.round(3.45));
		System.out.println(Math.round(3.51));
		
		System.out.println(Math.ceil(3.16)); //�Ҽ��� ù°�ڸ� �ø�
		System.out.println(Math.floor(3.56));  
		
		System.out.println(Math.ceil(-3.16)); //�Ҽ��� ù°�ڸ� �ø�
		System.out.println(Math.floor(-3.56));  
		
		System.out.println(Math.sqrt(9)); //3.0
		System.out.println(Math.pow(2, 3)); //2��3�� = 8
		
		//RandomŬ����
		Random random = new Random();
		System.out.println("0�̻�100�̸��� ���� : " + random.nextInt(100));
		
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
		
		// Calendar Ŭ���� : ���糯¥�� �ð������� ����
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)); // 2019
		// ��(0~11)
		System.out.println(cal.get(Calendar.MONTH)+ 1 + "��" ); // 7(8��)
	    System.out.println(cal.get(Calendar.DATE) + "��");
	    
	    
	    System.out.println(Calendar.AM); // 0����
	    System.out.println(Calendar.PM); // 1����
	    System.out.println(cal.get(Calendar.AM_PM)); // 1 ����
	    
	    System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "�ð�");
	    System.out.println(cal.get(Calendar.MINUTE) + "��");
	    System.out.println(cal.get(Calendar.SECOND) + "��");
	    
	    //1�� = 1000�и���, 0.5�� = 500�и���
	    System.out.println(cal.get(Calendar.MILLISECOND) + "�и���");
	    
	    // ���� ��1 ��2 ȭ3 ��4 ��5 ��6 ��7
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1: System.out.println("��"); break;
		case 2: System.out.println("��"); break;
		case 3: System.out.println("ȭ"); break;
		case 4: System.out.println("��"); break;
		case 5: System.out.println("��"); break;
		case 6: System.out.println("��"); break;
		case 7: System.out.println("��"); break;
		}
		
		//���� ��¥ �ð����� �����
		cal.clear();
		cal.set(2019, 8, 01);
		
		cal.set(Calendar.HOUR_OF_DAY, 20);
		cal.set(Calendar.HOUR,30);
		
		System.out.println(cal.toString());
		
		//DATE Ŭ����
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��(E)");
		String str = sdf.format(date);
		System.out.println(str);
		
		// Wrapper Ŭ����
//		int num = null; // �⺻�ڷ����� null �������
		Integer a = 5;
		Integer b = 3;
		System.out.println(a + b);
		
		
	} //main

}
