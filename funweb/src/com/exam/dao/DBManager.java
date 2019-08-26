package com.exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

	public static Connection getConnection() throws Exception {
		// DB�젒�냽�젙蹂�
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";

		Connection con = null;
		// 1�떒怨�: DB �뱶�씪�씠踰� 濡쒕뵫
		Class.forName("oracle.jdbc.OracleDriver");
		// 2�떒怨�: DB�뿰寃�
		con = DriverManager.getConnection(url, user, password);
		return con;
	}

	// SELECT문을 수행한 후 리소스 해제를 위한 메소드
	public static void close(Connection con, Statement pstmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	// INSERT, UPDATE, DELETE문을 수행한 후 리소스 해제를 위한 메소드
	public static void close(Connection con, Statement pstmt) {

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
