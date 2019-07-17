package com.exam;

import java.util.Scanner;

public class Test1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a, b, c;
			System.out.println("숫자 3개 입력");
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			if(a<=b) {
				if(a<=c) { //여기서 a가 제일 작은 값으로 판정
					if(b<=c) 
						System.out.printf("숫자 3개 중 두번째 큰 수는 : %d",b); //b와 c를 비교하여 c가 제일 크다고 판정(a<=b<=c)
					else 
						System.out.printf("숫자 3개 중 두번재 큰 수는 : %d",c);//반대로 b가 제일 크다고 판정(a<=c<=b)
					}
					else {
						if(b<=a) {//두번째 if 블럭 및 바로 위 if블럭 판정의 반대(a>=c) && (b>=c) 여기까지 보면 a가 제일 크다고 판정(c<=b<=a)
							System.out.printf("숫자 3개 중 두번째 큰 수는 : %d",b);
						}else
							System.out.printf("숫자 3개 중 두번째 큰 수는 : %d",a );//반대로 b가 제일 크다고 판정(c<=a<=b)
					}
			}
				else { 
					if(b<=c) { 
						if(a<=c) 
							System.out.printf("숫자 3개 중 두번째 큰 수는 : %d",a );
						else
							System.out.printf("숫자 3개 중 두번째 큰 수는 : %d",c );
					}
					else {
						if(b<=a) 
							System.out.printf("숫자 3개 중 두번째 큰 수는 : %d",b );
						else
							System.out.printf("숫자 3개 중 두번째 큰 수는 : %d",a );
					}
			}
	
		
		scan.close();
		
		}
		}
