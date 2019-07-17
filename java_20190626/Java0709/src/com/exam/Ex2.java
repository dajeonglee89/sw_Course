package com.exam;

public class Ex2 {
	//입력 매개변수 x 리턴값 x
	public static void star() {
		System.out.println("*****");
		System.out.println("*★★★*");
		System.out.println("*****");
	}
	//입력 매개변수 o 리턴값 x
	public static void star2(int a) {
		System.out.println("받은값 : " + a);
		System.out.println("*★★★*");
	}
	//입력 매개변수 x 리턴값 o
	public static String star3() {
		String str ="안녕";
		return str;
	}
	//입력 매개변수 o 리턴값 o
	public static int star4(int a, int b) {
		star();
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println("홍길동");
		star();
		System.out.println("----------");
		star2(20);
		System.out.println("----------");
		String s = star3();
		System.out.println(s);
		System.out.println("----------");
		System.out.println(star4(10,20));
	}

}
