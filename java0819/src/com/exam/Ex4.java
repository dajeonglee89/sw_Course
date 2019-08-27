package com.exam;

import java.sql.*;

public class Ex4 {

	public static void main(String[] args) {
		
		//DB접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//1단계 DB드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//2단계 DB연결
			con = DriverManager.getConnection(url,user,password);
			//3단계 SQL문 준비해서 실행
			String sql = "SELECT * FROM member ORDER BY id";
			//커넥션(연결)객체 CON으로부터 sql문 실행하는 문장객체 가져오기 
			//Statement stmt = con.createStatement(); 
			pstmt = con.prepareStatement(sql);
			//4단계 : 실행 select문 -> 결과 rs 저장
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
