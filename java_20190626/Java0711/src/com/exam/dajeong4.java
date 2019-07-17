package com.exam;

public class dajeong4 {

	public static void main(String[] args) {
		// 6x5 2차원 배열 / 1~ 30랜덤
		
		int[][]num = new int[6][5];
		for(int i=0; i<num.length; i++) {
			for(int a=0; a<num[i].length; a++) {
				num[i][a] = (int)(Math.random()*30)+1;
			System.out.print(num[i][a] + "\t");
			}
			System.out.println();
		}

		
		
		
		
		
		
	} //main

}
