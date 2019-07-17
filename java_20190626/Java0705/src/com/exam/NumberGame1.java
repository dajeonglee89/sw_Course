package com.exam;

import java.util.Scanner;
public class NumberGame1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임");
		int a = (int)(Math.random()*100)+1;
		
		if(a % 2 == 0) {
			System.out.println("컴퓨터가 선택한 숫자는 짝수입니다.");
		}else {
			System.out.println("컴퓨터가 선택한 숫자는 홀수입니다.");
		}
		
		System.out.print("숫자 입력 : ");
		int b = scan.nextInt();
		
		if(b > 100 || b < 1) {
			System.out.println("숫자범위를 초과하였습니다. 숫자범위는 1~100입니다. 다시 입력해주세요.");
			b = scan.nextInt();
		}
		
		for(int i = 1;; i++) {
		if(a > b) {
			System.out.println("컴퓨터가 더 큽니다. 더 큰 값을 입력하세요.");
			b = scan.nextInt();
		}else if(a < b) {
			System.out.println("컴퓨터가 더 작습니다. 더 작은 값을 입력하세요.");
			b = scan.nextInt();
		}else {
			System.out.println("축하합니다! 정답입니다!");
			System.out.printf("정답 까지 %d번 걸렸습니다.",i);
			break;
		}
		}
		scan.close();
	}

}
