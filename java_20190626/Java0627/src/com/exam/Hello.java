package com.exam;
	import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		String b;
		
		System.out.println("이름 입력");
			b = scan.next();
		System.out.println("나이 입력");
			a = scan.nextInt();	
		System.out.println("제 이름은 " + b + "이고 " + "나이는 " + a + "살 입니다.");
	scan.close();
	}

}
