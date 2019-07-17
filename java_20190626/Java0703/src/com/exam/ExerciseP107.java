package com.exam;
/* p. 104
 * 1. if(i=0) -> if(i ==0)
 * 2. 외부 if 문 {} 누락
 * 3.옵션 1 옵션 2 옵션 3
 * 4. 5.4
 * 
 *  p.107
 *  1. class
	2.  (1) public static void main(String[] args) {} 누락
		(2) SampleProgram.java
		(3) javac SampleProgram.java
		(4) java SampleProgram
	3. int %j;, double, 
	4.  (1) int height;
		(2) double size = 0.25;
		(3) double total = (double)height + size; 
		(4) char c = 'a';
		(5) String name = "홍길동";
	5.  (1) 79.8 double형
		(2) 3 int형
		(3) 3.333333333 double형
		(4) false boolean형
	6. final double bodyTemp = 36.5;
	7.  (1) while(1) -> while(조건)
		(2) int -> double 변경
		(3) int -> boolean 변경
		(4) (80 < score < 90) -> score > 80 && score < 90 변경
	8.  (1) age <= 12
		(2) age < b && age > c
		(3) age - 5 == 10
		(4) age != b || age == c
	9. int sum = (sum>100) ? 100 : 0
	10. System.out.println((n?5)? n : 5)
	11. String text = "\"를 출력하려면 \\ 다음에 \"를 붙여 \\\"과 같이 하면 됩니다."
	12.나는 "Java를 100%"사랑해
	13. (1) 190
		(2) 90
		(3)	30
		(4) 0
	14. switch(in){
		case "가위" : System.out.println(1);
		break;
		case "바위" :	System.out.println(2);
		break;
		case "보" :	System.out.println(3);
		break;
		default:
		System.out.println(0)
}





*/
public class ExerciseP107 {

	public static void main(String[] args) {
		int sum=0;
		switch('B') {
		case 'A' : sum += 100;
		case 'B' : sum += 50;
		case 'C' : sum += 30;
		case 'D' : sum += 10;

		}
		System.out.println(sum);
		
		
		
		
		System.out.println("나는 \"java를" + 100 + "%\"" + "사랑해");
	
	}
	

}
