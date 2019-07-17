package com.exam;




public class Ex1 {
	public static void main(String[] args) {
	//과제 1 for문 이용
	//누적합(1) + (1+2)....10까지
		int s = 0;
		int j = 0;
		for(int i =1; i<=10; i++ ) {
			j += i;
			s += j;
		}
		System.out.println(s);
	//과제2 for문 이용
	//(1)+(-2)....10까지	누적합
		int k = 0;
		for(int i =1; i<=10; i++) {
			if(i % 2 == 0) {
				 k = (-i)+k;
			}else
				k += i;	
		}
		System.out.println(k);
		
		
	//과제3 for 중첩, if	
	//두개의 주사위를 던졌을때 눈의 합이 6이 되는모든경우
		for(int a = 1; a<=6; a++) {
			for(int b =1; b<=6; b++) {
				if(a + b == 6) {
					System.out.printf("%d and %d\n",a,b);
				}
			}
		}
		
		
	//과제4 이중 for, if
	//2x + 4y = 10 0<=x<=10, 0<=y<=10
	//식을 만족하는 모든 x,y 값 구하기
	for(int x = 0; x <=10; x++) {
		for(int y = 0; y<=10; y++) {
			if(2*x + 4*y == 10) {
				System.out.printf("x = %d, y = %d\n",x,y);
			}
		}
	}
	
	
	
	
	
	
	}

}
