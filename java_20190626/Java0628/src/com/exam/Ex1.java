//자료형 우선은 실수형 > 정수형             *실수형 무조건 우선순위*
// byte, short형 데이터 연산시 int형 강제 변환

package com.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("숫자 2개 받아 연산");
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println("몫 : " + (a / b));
		System.out.println("나머지 : "+ (a % b));
		System.out.println("몫 : " + ((double)a / b));
	
	
	
	scan.close();
	
	
		
	}
	
}
