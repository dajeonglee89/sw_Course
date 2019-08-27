package com.exam;

import java.util.HashMap;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("홍길동", 90);
		scoreMap.put("이다정", 89);
		scoreMap.put("이샤보", 14);
		
		System.out.println("HashMap의 요소개수 : " + scoreMap.size());

	}

}
