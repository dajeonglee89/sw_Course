package com.exam;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 하나 입력");
		int a = scan.nextInt();

		if (a < 0) {
			a *= -1;
		}

		System.out.println("절대값 : " + a);
		System.out.println("절대값 구하기 완료");

		a = 30;
		int max, min, b = 20;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;

		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	   

		
		
		
		scan.close();
	}

}
