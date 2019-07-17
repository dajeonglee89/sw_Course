package com.exam;

public class Ex3 {
	public static void main(String[] args) {
			for(int i=2; i<10; i++) {
				for(int j=1; j<10; j++) {
					System.out.println(i +"*"+ j +"="+ i * j);
				}
					System.out.println("\t");
					System.out.println("");
			}
		
/*			for(int i=5; i==5; i++) {
				for(int j=1; j<10; j++) {
					System.out.println(i +"*"+ j +"="+ i * j);
				}
					System.out.println("");
			}
*/			
			
			
			
		int f = 0;
		for(int i = 0; i<=100; i++) {
			f = i * 9/5 + 32;
			System.out.printf("섭씨온도 %d도 = 화씨온도 %d도\n", i, f);
		}
			
			
			
			
	}

}

