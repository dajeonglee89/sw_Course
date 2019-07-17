package com.exam;

public class Ex2 {
	public static void methodA(int a) {
		a = 11;
		System.out.println(a);
	}

	public static void methodB(int iArr[]) {
		iArr[0] = 11;
	}
	
	public static void main(String[] args) {
		int a = 10;
		methodA(a);
		System.out.println(a);
	
		int iArr[] = {10,20,30};
		methodB(iArr);
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
	
	
	
	
	
	
	
	
	}

}

