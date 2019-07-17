package com.exam;

public class ControlEx {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			int count = 0;
			for(int j = 1; j<=i; j++) {
				if(i % j == 0) {
					count ++;
				}
			}
				if(count == 2) {
					System.out.println(i);
					sum += i;
				}
		}
			System.out.println(sum);
	
	
	
	
	}

}
