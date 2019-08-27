package com.exam;

import java.sql.*;

public class Ex4 {

	public static void main(String[] args) {
		
		//DB��������
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//1�ܰ� DB����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			//2�ܰ� DB����
			con = DriverManager.getConnection(url,user,password);
			//3�ܰ� SQL�� �غ��ؼ� ����
			String sql = "SELECT * FROM member ORDER BY id";
			//Ŀ�ؼ�(����)��ü CON���κ��� sql�� �����ϴ� ���尴ü �������� 
			//Statement stmt = con.createStatement(); 
			pstmt = con.prepareStatement(sql);
			//4�ܰ� : ���� select�� -> ��� rs ����
			//ResultSet rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}

}
	
}
