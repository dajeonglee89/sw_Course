package com.exam;


import java.util.Scanner;
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		if(score >=80) {
			System.out.println("축하합니다! 합격입니다.");

		}
		
		scan.close();
		
		
	}

}
