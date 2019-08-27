package com.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// �ڹٺ�(Java Bean, �����Ͱ�ü)
// VO(Value Object, ����ü)
// Map �÷��� ����� �뵵.
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
		map.put("Ȳ����", new Student(1, "010-111-1111"));
		map.put("������", new Student(2, "010-222-2222"));
		map.put("�賲��", new Student(3, "010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�˻����̸�? ");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("exit")) {
				break;
			}
			Student stu = map.get(name);
			if(stu == null) {
				System.out.println(name + "���»���Դϴ�.");
			}else {
				System.out.println("id:" + stu.getId() + ", ��ȭ : " + stu.getTel());
			}
//			scanner.close();
		}

	}

}
