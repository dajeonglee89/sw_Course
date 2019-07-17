package com.exam;

public class Ex3 {
	public static void main(String[] args) {
			//상호 호환형(정수형, 실수형) 내에서는 자료형변환가능
		double a = 7;
		System.out.println(a);
		int b = (int)7.7;
		System.out.println(b);
		
		
		
		char ch = 'A';
		System.out.printf("%c -> %d\n" ,ch, (int)ch);
		
		int c = 65;
		System.out.printf("%d -> %c", c, (char)c);
		
		
		//실수형, 정수형 모두 바이트 크기 기준
		//정수와 실수간에는 바이트 크기 상관없이 실수 우선
		
	}
}
