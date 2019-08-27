package com.exam;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// Math 클래스 	
		System.out.println(Math.round(3.45));
		System.out.println(Math.round(3.51));
		
		System.out.println(Math.ceil(3.16)); //소수점 첫째자리 올림
		System.out.println(Math.floor(3.56));  
		
		System.out.println(Math.ceil(-3.16)); //소수점 첫째자리 올림
		System.out.println(Math.floor(-3.56));  
		
		System.out.println(Math.sqrt(9)); //3.0
		System.out.println(Math.pow(2, 3)); //2의3승 = 8
		
		//Random클래스
		Random random = new Random();
		System.out.println("0이상100미만의 난수 : " + random.nextInt(100));
		
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
		
		// Calendar 클래스 : 현재날짜와 시간정보를 가짐
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)); // 2019
		// 월(0~11)
		System.out.println(cal.get(Calendar.MONTH)+ 1 + "월" ); // 7(8월)
	    System.out.println(cal.get(Calendar.DATE) + "일");
	    
	    
	    System.out.println(Calendar.AM); // 0오전
	    System.out.println(Calendar.PM); // 1오후
	    System.out.println(cal.get(Calendar.AM_PM)); // 1 오후
	    
	    System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시간");
	    System.out.println(cal.get(Calendar.MINUTE) + "분");
	    System.out.println(cal.get(Calendar.SECOND) + "초");
	    
	    //1초 = 1000밀리초, 0.5초 = 500밀리초
	    System.out.println(cal.get(Calendar.MILLISECOND) + "밀리초");
	    
	    // 순서 일1 월2 화3 수4 목5 금6 토7
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1: System.out.println("일"); break;
		case 2: System.out.println("월"); break;
		case 3: System.out.println("화"); break;
		case 4: System.out.println("수"); break;
		case 5: System.out.println("목"); break;
		case 6: System.out.println("금"); break;
		case 7: System.out.println("토"); break;
		}
		
		//현재 날짜 시간정보 지우기
		cal.clear();
		cal.set(2019, 8, 01);
		
		cal.set(Calendar.HOUR_OF_DAY, 20);
		cal.set(Calendar.HOUR,30);
		
		System.out.println(cal.toString());
		
		//DATE 클래스
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초(E)");
		String str = sdf.format(date);
		System.out.println(str);
		
		// Wrapper 클래스
//		int num = null; // 기본자료형에 null 저장못함
		Integer a = 5;
		Integer b = 3;
		System.out.println(a + b);
		
		
	} //main

}
