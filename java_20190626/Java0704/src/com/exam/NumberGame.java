package com.exam;

import java.awt.Toolkit;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임입니다.");
		int rnd = (int)(Math.random()*4)+6;
		String s = "";
		
		if(rnd % 2 == 0) {
			s = "컴퓨터가 결정한 숫자는 짝수입니다.";
		}else {
			s = "컴퓨터가 결정한 숫자는 홀수입니다.";
		}
		System.out.println(s);
	
		
		
		System.out.print("임의의 숫자 입력(6~9) : ");
		int a = scan.nextInt();
	
		System.out.printf("사용자 : %d, 컴퓨터 : %d\n", a, rnd);
		
		if(a == rnd) {
			System.out.println("정답입니다!");

		}else {
			System.out.println("틀렸습니다 ㅠㅠ");
		}
	
	Toolkit tool = Toolkit.getDefaultToolkit();
	tool.beep();
	scan.close();
	}

}
