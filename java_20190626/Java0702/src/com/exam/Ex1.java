//break -> switch, 반복문 


package com.exam;


import java.util.Scanner;


public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 1~7");
		int a = scan.nextInt();
		char w =' ';
		
		switch (a) {
		case 1:
			w = '월';
		break;
		case 2:
			w = '화';
		break;
		case 3:
			w = '수';
		break;
		case 4:
			w = '목';
		break;
		case 5:
			w = '금';
		break;
		case 6:
			w = '토';
		break;
		default:
			w = '일';
		}
	
		System.out.println(w + "요일");
		System.out.println("요일 구하기 끝\n");
		
		
		System.out.println("학점입력");
		String grade ="";
		String s = "";
		grade = scan.next();
		
		switch (grade) {
		case "A":
			s = "매우우수";
		break;
		case "B":
			s = "우수";
		break;
		case "C":
			s = "보통";
		break;
		case "D":
			s = "미흡";
		break;
		default:
			s = "매우미흡";
		}
		System.out.println(s);
		
		
		scan.close();
	}
}
