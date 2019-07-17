//++변수, --변수 다른 명령보다 먼저 수행하는 선행처리 연산
//변수++, 변수 -- 다른 명령 처리 후 수행 하는 후행처리 연산



package com.exam;

public class Ex2 {
public static void main(String[] args) {
	int a = 0, b = 0;
	System.out.println("a = " + ++a);//a변수 증가 후 출력
	System.out.println("b = " + b++);//출력 후 b변수 증가

	a = 0; b = 0;
	
	int sum = 0;
	sum = ++a + ++b;//2
	a = 0; b = 0;
	System.out.println(sum);
	
	sum = 0;
	sum = a++ + b++;//0
	System.out.println(sum);

}
}
