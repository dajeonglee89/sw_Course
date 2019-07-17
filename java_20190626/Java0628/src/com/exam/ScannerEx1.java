package com.exam;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
		System.out.println("--------시작--------");
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이름 입력 : ");		
		String n = scan.nextLine();
		System.out.print("올해 나이 입력 : ");
		int a = scan.nextInt();
		System.out.print("몸무게 입력 : ");
		double w = scan.nextDouble();
		
		System.out.println("이름은 : " + n +" \n내년 나이는 : " + (a+1) + "\n몸무게는 : " + w);
		
		System.out.println("--------종료--------");
		
		
		scan.close();
		
	}
}
