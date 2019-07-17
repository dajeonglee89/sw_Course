//mod 연산으로 홀짝 구분


package com.exam;

import java.util.Scanner;

public class ModEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a;
		
		a = scan.nextInt();
		
		if (a % 2 == 0) {
			System.out.println(a + "은/는 짝수입니다.\n");
		}
		else {
			System.out.println(a + "은/는 홀수입니다.\n");
		}
		
		System.out.println("홀짝구분 종료\n");
		
		if(a > 0) {
			System.out.println(a + "은/는 양수입니다.\n");
		}else if(a == 0) {
			System.out.println(a + "은/는 0 입니다.\n");
		}else
			System.out.println(a + "은/는 음수입니다.\n");
		
		System.out.print("숫자 구분 종료\n");
		
		System.out.print("\n점수입력 : ");
		int score = scan.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else
			System.out.println("F");
	
	
		
		
	
		scan.close();
	}
	
		
		
		
	
	
	

}
