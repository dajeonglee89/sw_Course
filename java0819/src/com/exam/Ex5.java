package com.exam;

import java.sql.SQLException;

public class Ex5 {

	public void methodA() throws Exception {
		System.out.println("methodA ����");
		methodB();
		System.out.println("methodA ����");
	}

	public void methodB() throws Exception {
		System.out.println("methodB ����");
//		try {
		methodC();			
//		}chtch (Exception e){
//			e.printStackTrace();
//		}
		
		System.out.println("methodB ����");
	}
	
	// public abstract void methodD() throws Exception;

	public void methodC() throws ClassNotFoundException, SQLException, Exception{
		System.out.println("methodC ����");

		Class.forName("oracle.jdbc.OracleDriver");
		
		System.out.println("methodC ����");
	}
	

	public static void main(String[] args) {
		Ex5 ex = new Ex5();
		try {
			ex.methodA();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
