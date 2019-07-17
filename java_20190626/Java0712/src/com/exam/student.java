package com.exam;

public class student {
	
	// 학번 정수형 hakbun
	
	// 학생이름 문자열 name
	
	// 국어점수 정수형 kor
	
	// 영어점수 정수형 eng
	
	// 수학점수 정수형 math
	
	
	int hakbun;
	String name;
	int kor;
	int eng;
	int math;
	
	//기본생성자
	student(){
		System.out.println("student생성자 호출됨.");
		// 60~100사이의 임의의 값으로 점수 초기화
		kor = (int)(Math.random()*41) + 60;
		eng = (int)(Math.random()*41) + 60;
		math = (int)(Math.random()*41) + 60;
	}
	
	
	// 합계 구해서 리턴하는 메소드 (국어+영어+수학)
	// 리턴_정수형 sum()
	
	int sum(){
	int sum = kor + eng + math;
	return sum;
	}

	// 평균 구해서 리턴하는 메소드
	// 리턴_실수형 avg()
	
	double avg() {
		
		double avg =sum() / 3d;
		
		return avg;
	} 
		
	
	
	
	
}
