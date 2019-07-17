package com.exam;

public class Ex2 {
	public static void main(String[] args) {
		//무한루프(for)
		/*
		 * for(;;){ System.out.println("aa"); }
		 */
	
		int i = 1;
		int s = 0;
		for(i=1;;i++) {
			if(i % 2 ==0) {
				s = s+(-i);
			}else
				s += i;
			if(s >=100) {
				break;
			}
		}System.out.println("sum = " + s);
	
	
	
	
	}

}
