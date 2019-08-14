<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//post 파라미터 한글처리
request.setCharacterEncoding("utf-8");
//파라미터값 가져오기
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");

//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
//3단계 : id에 해당하는 passwd 가져오기
String sql = "SELECT passwd FROM member WHERE id=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1,id);
//4단계 : sql문 실행
ResultSet rs = pstmt.executeQuery();
//5단계 rs 데이터 있으면 "아이디 있음"
//                  패스워드 비교 맞으면 delete수행. "삭제성공"
//                            틀리면 "패스워드틀림."
//             없으면 "아이디 없음"
if(rs.next()){ //아이디 있음
	if(passwd.equals(rs.getString("passwd"))){ //("passwd") -> (1) 가능
		pstmt.close(); //select문을 가진 pstmt 객체 닫기
		
		// delete문 수행.삭제성공
	    sql = "DELETE FROM member WHERE id = ?";
	    pstmt = con.prepareStatement(sql);
	    pstmt.setString(1,id);
	    //실행
	    pstmt.executeUpdate();
	    %><p>회원삭제 성공</p><%
	}else{
		%><p>패스워드 틀림</p><%
	}
}else{
	%><p>아이디없음</p><%	
}


%>




</body>
</html>