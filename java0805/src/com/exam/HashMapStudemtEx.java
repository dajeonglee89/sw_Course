package com.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 자바빈(Java Bean, 데이터객체)
// VO(Value Object, 값객체)
// Map 컬렉션 비슷한 용도.
class Student{
	private int id;
	private String tel;

	Student(int id, String tel){
		super();
		this.id = id;
		this.tel = tel;
	}

	int getId() {
		return id;
	}
	String getTel() {
		return tel;
	}


}



public class HashMapStudemtEx {

	public static void main(String[] args) {

		Map<String, Student> map = new HashMap<String, Student>();
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이제문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할이름? ");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("exit")) {
				break;
			}
			Student stu = map.get(name);
			if(stu == null) {
				System.out.println(name + "없는사람입니다.");
			}else {
				System.out.println("id:" + stu.getId() + ", 전화 : " + stu.getTel());
			}
//			scanner.close();
		}

	}

}
