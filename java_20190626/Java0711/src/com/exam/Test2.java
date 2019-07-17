package com.exam;

public class Test2 {

	public static void main(String[] args) {
		int[]arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		System.out.println("랜덤정수 :");
		int sum = 0;
		for(int num : arr) {
			System.out.print(num+" ");
			sum += num;
		}
		System.out.println();
		
		double avg = (double)sum / arr.length;
		System.out.println("평균 = " + avg);
		
		
	} //main

}
