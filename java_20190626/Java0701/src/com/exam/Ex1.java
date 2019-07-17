//논리연산(&&(and), ||(or), !(not))
//!(not) -> 논리부정회로
//&&(and) -> 두 입력값이 모두 true 일 때
//||(or) -> 두 입력값 중 하나라도 true면 true
package com.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		int a, b;
		
		System.out.println("숫자 2개 입력받아 논리판단");
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("논리연산 결과값(not, and, or)");
		System.out.println("(! a > b) = " + !(a>b));
		System.out.println("(a > b && a < b) = " + ((a>b) && (a<b)));
		System.out.println("(a > b || a < b) = " + ((a>b) || (a<b)));
		
		
		System.out.println("나이입력");
		int age = scan.nextInt();
		String str = (age >= 10 && age < 20)?"10대 입니다.":"10대가 아닙니다." ;
		System.out.println(age + "세 -> " + str);
		//나이를 입력받아 10대인지 아닌지 판단
		
		
		System.out.println("주민등록번호 뒤에 첫자리 입력(범위는 1 - 4)");
		int jumin = scan.nextInt();
		String first = (jumin == 1 || jumin == 3)?"남자":"여자";
		System.out.println(jumin + " -> " + first);
		//주민등록번호 맨 뒤 첫자리 입력받아 성별판단
	
		*/
		int k, e, m, sum;
		String total;
		System.out.println("국어, 영어, 수학 점수 입력");
		k = scan.nextInt();
		e = scan.nextInt();
		m = scan.nextInt();
		sum = k + e + m;
		double avr = (int)((sum / 3.0)*100)/100.0; //소수점 이하 2자리 표현
		
		System.out.println("국어 : " + k + " 영어 : " + e + " 수학 : " + m + "\n합계 : " + sum + " 평균 : " + avr);
		total = (avr >= 60 && k >= 40 && m >= 40 && e >= 40)?"합격":"불합격";
		System.out.println(total);
		
		scan.close();
		
	}

}
