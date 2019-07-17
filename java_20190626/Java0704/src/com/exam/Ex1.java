package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
		System.out.println(i);
			i++;
		}
		System.out.println("----------");
		for(int  j = 1; j<=10; j++) {
			if(j % 2 == 0) {
				continue;
			}
			System.out.println(j);
		}
		System.out.println("----------");
		boolean isHomeworkFinished = true;
		i = 0;
		while(!isHomeworkFinished) {
			if(i == 3) {
				break;
			}
			System.out.println("숙제해야해");
			i++;
		}
			
		do {
			if( i == 3) {
			break;
			}
			System.out.println("숙제해야해");
		} while(!isHomeworkFinished);
	
	
	
	
	
	
	
	}

}
