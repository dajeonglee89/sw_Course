package com.exam;
	import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double pi, area;
	int r;
	System.out.println("반지름 입력");
	
	pi = 3.14;
	r = scan.nextInt();
	area = r * r * pi;
	
	System.out.println("\"반지름이\" " + r + " 인 \n \t \\원의 면적\\ 은 " + area + " 이다.");
		
		
		
		
		scan.close();
		
	}
	

}
