package com.exam;

public class Ex3 {
	public static void main(String[] args) {

	for(int i=11; i<=20; i++) {
		System.out.printf("Hello %d\n",i);
	}

	
	for(int i=0; i<=9; i++) {
		System.out.print(i + " ");
	}
	System.out.println("------------------ 0 - 9 오름차순");
	
	for(int i=2; i<=20; i += 2) {
		System.out.print(i + " ");
	}
	System.out.println("------------------2 - 20 2열 오름차순");
	
	for(int i=10; i>=1; i--) {
		System.out.print(i+ " ");
	}
	System.out.println("------------------1 - 10  내림차순");
	
	

	}
	
	
}
