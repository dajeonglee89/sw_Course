package com.exam;

import java.util.HashMap;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("ȫ�浿", 90);
		scoreMap.put("�̴���", 89);
		scoreMap.put("�̻���", 14);
		
		System.out.println("HashMap�� ��Ұ��� : " + scoreMap.size());

	}

}
