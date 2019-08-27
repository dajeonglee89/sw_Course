package com.exam;

import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) {
		String str = "Java";
		str += "Programming";
		
		// StringBuffer : ����ũ���� ���۸� ����.
		// ��ü �ڽ��� ���ڿ��� ���� ����.
		StringBuffer sb = new StringBuffer();
		sb.append("Java"); // �޺κп� �߰�
		System.out.println(sb.toString());
		sb.append(" Programming");
		System.out.println(sb);

		sb.replace(0, 4, "JSP");
		System.out.println(sb);
		
		sb.insert(3, ",");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("===========");
		
		//StringTokenizer : ���ڿ��� �и��ϱ� ���� ���.
		// StringŬ������ split()�޼ҵ�� ������ ���.
		
		String strFruits = "���#��#��#����";
		
		StringTokenizer st = new StringTokenizer(strFruits, "");
		// ��ū
		// ���й���(Delimeter)
		
		
		System.out.println(st.countTokens()); // ��ū���� : 4
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println(st.countTokens()); // ��ū���� : 0
		
		String query = "name=gildong&addr=busan&age=27";
        
		
		// &, = ��� ���й��ڰ� ��.
		StringTokenizer st2 = new StringTokenizer(query, "&=");
		System.out.println(st2.countTokens());
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
		
		
				
	} //main

}
