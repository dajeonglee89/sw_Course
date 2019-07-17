package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		student st = new student();
		st.hakbun = 1;
		st.name = "이다정";
		st.kor = 100;
		st.eng = 99;
		st.math = 85;
		
		System.out.println(st.name);
		System.out.println("총점 : " + st.sum());
		System.out.println("평균 : " + st.avg());
		
		
		student st2 = new student();
		st2.hakbun = 2;
		st2.name = "이다정이";
		System.out.println(st2.name);
		System.out.println(st2.kor);
		System.out.println(st2.eng);
		System.out.println(st2.math);
		System.out.println("총점 : " + st2.sum());
		System.out.println("평균 : " + st2.avg());
		
	}

}
