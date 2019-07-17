package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, d, max, min, abs;
		System.out.println("숫자 2개 입력");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("절대값을 구할 숫자입력");
		d = scan.nextInt();		
		
		
		System.out.println("A와 B 대소판단");
		boolean c;
		c = a > b;
		System.out.println(c);
		
		
		max = a>b?a:b;
		System.out.println("최대값 : " + max);
		min = a>b?b:a;
		System.out.println("최소값 : " + min);
		abs = d>0?d:d*-1;
		System.out.println("절대값 : " + abs);
	
	
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
