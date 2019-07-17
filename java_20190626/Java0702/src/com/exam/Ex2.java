//키와 몸무게를 입력받아 bmi지수와 비만도 출력하는 소스
package com.exam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키 입력");
		int height = scan.nextInt();
		System.out.println("몸무게 입력");
		int weight = scan.nextInt();		
		
		double dHeight, bmi;
		String bm="";
		
		dHeight = (double)height/100;
		
		bmi = weight / (dHeight * dHeight);
		
		if(bmi >= 18.5) {
			if(bmi >= 23.0) {
				if(bmi >= 25.0) {
					if(bmi >= 30.0) {
						bm = "고도비만";
					}else
						bm = "비만";
					}else
						bm = "과제중";
					}else	
						bm = "표준체중";
					}else
						bm = "저체중";
		
	//System.out.println(dHeight);
	System.out.printf("당신의 bmi지수는  %.2f이고 비만도는 %s입니다." ,bmi ,bm);
		
	scan.close();
	
	
	}
}
