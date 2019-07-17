package com.exam;
 import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 2개 입력");
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("a변수 출력\n");
		System.out.println("a = " + a);
		System.out.printf("a = %d\n", b);
		
	
		scan.close();
	}

}


//printf <- 폼지정 출력방식
//%d(정수), %f(실수), %c(문자하나), %s(문자열)