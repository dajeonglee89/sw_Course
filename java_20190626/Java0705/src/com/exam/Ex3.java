package com.exam;
//배열 : 같은 자료형의 기억장소를 여러개 사용, 객체
//객체 기본값 -> 정수형 0 0L, 실수형 0.0 0.0f, 논리형 false, 참조형 null





public class Ex3 {
	public static void main(String[] args) {
		int[] a; //정수형 배열을 참조하는 참조변수
		
		int iArr[] = new int[5];
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = 10;
			System.out.printf("iArr[%d] = %d\n", i, iArr[i]);
		}
		System.out.println("----------");
		
		for(int i : iArr) {
			System.out.println(i);
		}
		
		System.out.println("----------");
		double dArr[] = new double[4];
			   dArr = new double[] {1.1, 2.2, 3.3, 4.4};
		
		for(double d : dArr) {
			System.out.println(d);
		}
		
		System.out.println("----------");
		String sArr[] = new String[4];
			   sArr[0] = "홍길동";
			   sArr[1] = "성춘향";
			   sArr[2] = "이몽룡";
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		
		System.out.println("----------");
		boolean bArr[] = new boolean[3];
				bArr[0] = true;
				bArr[1] = true;
		for(int i=0; i<bArr.length;i++) {
			System.out.println(bArr[i]);
		}
	
	
		
	
	
	
	}
	

}
