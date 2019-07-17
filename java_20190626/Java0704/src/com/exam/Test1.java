package com.exam;

import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a, b;
	System.out.println("정수 2개 입력");
	a = scan.nextInt();
	b = scan.nextInt();
	System.out.println("연산자 입력 (+,  -, *, /, %)");
	String c = scan.next();
	
	if(c.equals("+")) {
			System.out.printf("%d + %d = %d", a, b, a+b);
		}else if(c.equals("-")) {
			System.out.printf("%d - %d = %d", a, b, a-b);
		}else if(c.equals("*")) {
			System.out.printf("%d * %d = %d", a, b, a*b);
		}else if(c.equals("/") && b == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}else if(c.equals("/")) {
			System.out.printf("%d / %d = %.1f", a, b, (double)a/b);
		}else if(c.equals("%"))
			System.out.printf("%d %% %d = %d", a, b, a%b);
		else 
			System.out.println("연산자가 잘못되었습니다.");

	
	
	
	scan.close();
	}
	}


