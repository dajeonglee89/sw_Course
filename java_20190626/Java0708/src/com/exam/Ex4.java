package com.exam;

public class Ex4 {
	public static void main(String[] args) {
		int a[][] = new int[5][3]; 
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
			System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		int b[][] = {{10,20},{30,40},{50,60}};
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
			System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
	
	}

}
