package com.exam;

public class Ex5 {
	public static void main(String[] args) {
		int num[][] = {{1,2},{3,4},{5,6,7}};
	
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
				System.out.println();
		}
	
	
	String names[][] = {{"홍길동", "이순신"},{"유관순"}};
	for(int i = 0; i<names.length; i++) {
		for(int j = 0; j<names[i].length; j++) {
			System.out.print(names[i][j] + "\t");
		}
			System.out.println();
	}
	
	names = new String[2][];
	names[0] = new String[2];
	names[1] = new String[1];
	
	}

}
