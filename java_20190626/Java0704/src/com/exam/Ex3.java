package com.exam;

public class Ex3 {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j = 0; j<i; j++) {  //<- 실질적으로 "*" 를 찍어주는 반복 구문
				System.out.print("*");
			}
				System.out.println(""); //<- "*" 를 찍고 개행해주는 반복 구문
		}
		System.out.println("----------");
		
		//디지털 시계 출력(0시 0분 ~ 23시 59분)
		/*for(int i = 0; i <=23; i++) {
			for(int j = 0; j<=59; j++) {
				System.out.printf("%d시 %d분\n", i, j);
			}

		}
		 */	
		//이중 for문 -> ***** 5행 반복 
		for(int i = 1; i<=5; i++) {
			for(int j = 0; j<=5; j++) {  
				System.out.print("*");
			}
				System.out.println(""); 
		}
		
		
		System.out.println("----------");
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i +"*"+ j +"="+ i * j + " ");
			}
				System.out.println("\t");
				System.out.println("");
		}
		
		
		System.out.println("----------");
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j +"*"+ i +"="+ i * j + " ");
			}
				System.out.println("\t");
				System.out.println("");
		}
		
		
		System.out.println("----------");
		for(int i = 1; i<=5; i++) {
			for(int j = 5; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("----------");	
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
				System.out.println();
			
		}
	
	
	
	
	
	}


	
	
	}
	
