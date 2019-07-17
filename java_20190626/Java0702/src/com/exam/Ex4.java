package com.exam;

public class Ex4 {
	public static void main(String[] args) {
	int sum = 0;
	for(int i= 1; i<=10; i++) {
		sum += i;
	System.out.print(i);
	if(i<=9) {
		System.out.print("+");
	}else {
		System.out.print("=");
		System.out.println(sum);
	}

	
	}
	sum = 0;
	for(int i = 1; i<=100; i++) {
		sum += i;
	}
		System.out.println("1 ~ 100 까지의 합 : " + sum);
	
	
	sum = 0;
	for(int i=1; i<=10; i +=2) {
		sum += i;
	}
		System.out.println("1 ~ 10 까지 홀수들의 합 : " + sum);
//for 문만 이용한 1 - 10까지 홀수들의 합	
		
	sum = 0;
	for(int i = 1; i<=10; i++) {
		if(i % 2 == 1) {
			sum += i;
		}
	}
		System.out.println("1 ~ 10 까지 홀수들의 합 : " + sum);
//for 문과 if 문을 병행한 1 - 10 까지 홀수들의 합	
	
	
	}

}
