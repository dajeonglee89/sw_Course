package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("=== ���α׷� ���� ===");
		
		int a = 10, b = 2, result = 0;

		String str = "���ڿ�";
		
		int[] arr = {10,20,30};
		
		try {			
			result = a / b; //0���� ����
			System.out.println("result : " + result);
			
			char ch = str.charAt(0); //null���� ���
			
			System.out.println("arr[3] = " + arr[3]); //�߸��� �ε��� ���
			
			// ���������� ���� �ѱ� 
		} catch (ArithmeticException e) {
			System.out.println("���п������ ���ܹ߻�");
			e.printStackTrace();
		} catch (NullPointerException e){
			System.out.println("null�������� ��� ���ܹ߻�");
			e.printStackTrace();
		} catch (RuntimeException e){
			// System.out.println("��Ÿ�� ���ܹ߻�");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("���ܹ߻�");
			e.printStackTrace();
		} finally {
			System.out.println("���ܹ߻����� ������� �����۾�");
			/*
			 ����� ��ü �ڿ� �ݱ� ����
			 rs.close();
			 pstmt.close();
			 con.close(0; 
			 * */
			// ���������� ���� ����
		}

		
		
		System.out.println("=== ���α׷� �������� ===");
	}

}
