package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		int num[] = new int[] {79,88,91,33,100,55,95,81,75,64};
		int max = 0;
		//배열 안에서 최대값 찾기
		for(int i = 0; i<num.length; i++) {
				if(max < num[i]) {
					max = num[i];
			}
		}System.out.printf("배열의 최대값 : %d\n", max);
			
		System.out.println("----------");
		
		//배열 안에서 최소값 찾기
			int min = num[0];
		for(int i = 1; i<num.length; i++) {
					if(min > num[i]) {
						min = num[i];
					}
		}System.out.printf("배열의 최소값 : %d\n", min);
					
		
		
		System.out.println("----------");		
		
		
		//배열 안에 저장된 값 오름차순
		for(int i = 0; i<num.length; i++) {
			for(int j = i + 1; j<num.length; j++) {
			if(num[i] > num[j]) {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
			System.out.println(num[i]);
		}
		
		
		System.out.println("----------");
		//배열 안에 저장된 값 내림차순
		for(int i = 0; i<num.length; i++) {
			for(int j = i + 1; j<num.length; j++) {
			if(num[i] < num[j]) {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
			System.out.println(num[i]);
		}
		
		
		
		
		
		
		
	}

}
