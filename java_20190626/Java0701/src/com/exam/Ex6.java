//중첩 if문 조건 범위는 큰 범위에서 작은범위로 좁혀가야함
//if문 시작 조건 범위는 크게, 마지막 조건 범위는 제일 작게


package com.exam;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력");
		int score = scan.nextInt();
		String grade = "";
		
		if(score >= 80) {
			if(score >= 90) {
				if(score >= 94) {
					if(score >= 98) {
					grade = "A+";
				}
				else
					grade = "A";
				}
				else
					grade = "A-";
				}
				else
					grade = "B";
			}

		System.out.println("점수는 " + score + "점 이고, " + "학점은 " + grade + "입니다.");

	
	   scan.close();
	



		}
		
			
}




	

