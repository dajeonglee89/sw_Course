package com.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex5 {

	public static void main(String[] args) {
		// map
		Map<String, Puppy> puppyMap = new HashMap<String, Puppy>();
		
		puppyMap.put("Ǫ��", new Puppy(2));
		puppyMap.put("��ī���ĴϿ�", new Puppy(5));
		puppyMap.put("������������", new Puppy(7));
		
		Puppy p1 = puppyMap.get("��ī���ĴϿ�");
		
		puppyMap.put("��ī���ĴϿ�", new Puppy(3)); //����
		
		Set<String> keySet = puppyMap.keySet();
		System.out.println(keySet);
		
		
		for(String key : keySet) {
			System.out.println(key);
		
			Puppy p = puppyMap.get(key);
			p.speak();
		}
		
		System.out.println("===========");
		
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			
			Puppy p = puppyMap.get(key);
			p.speak();
		}
		
		System.out.println(puppyMap.size());
		
		puppyMap.remove("Ǫ��");
		System.out.println(puppyMap);
		System.out.println(puppyMap.size());
		
		

	} // main

}
