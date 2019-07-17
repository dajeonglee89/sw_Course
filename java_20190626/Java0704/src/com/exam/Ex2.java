package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		for(int i = 1; i<100; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
			}
		}
		
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 1; i<=10; i++) {
			if( i % 2 == 1) {
				oddSum += i;
			}else
				evenSum += i;
		}
		System.out.printf("1~10까지 숫자 중\n홀수의 합 : %d\n짝수의 합 : %d", oddSum, evenSum);
	
	
	
	
	
	
	
	
	}

}
