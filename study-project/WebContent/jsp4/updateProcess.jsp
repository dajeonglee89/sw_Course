<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%    
String id = (String) session.getAttribute("id");
// 세션값 없으면 loginForm.jsp로 이동
if(id == null){
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<%
//한글처리
request.setCharacterEncoding("utf-8");
//파라미터값 가져오기
String passwd = request.getParameter("passwd");
String name = request.getParameter("name");

String strAge = request.getParameter("age");
Integer age = null;
if(!strAge.equals("")){
	age = Integer.parseInt(strAge);
}

String gender = request.getParameter("gender");

String email = request.getParameter("email");
if(email.equals("")){
	email = null;
}
%>

<%
//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
//3단계: sql문 준비, id에 해당하는 passwd 가져오기
String sql = "SELECT passwd FROM member WHERE id = ?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);
//4
ResultSet rs = pstmt.executeQuery();
//5단계: rs사용
//rs데이터 있으면
//  패스워드 비교 맞으면 update수행 후 main.jsp 이동
//            틀리면 '패스워드틀림' 뒤로이동
if(rs.next()){
	if(passwd.equals(rs.getString("passwd"))){
		pstmt.close(); // select문 가진 pstmt닫기
		
		//update문 수행. id에 해당하는 name age gender email 수정
	sql = "UPDATE member SET name=?, age=?, gender=?, email=? WHERE id=?";
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, name);
	pstmt.setObject(2, age); //Integer값 설정 **숫자넣고싶은데 null로 넣어야할때setObeject
	pstmt.setString(3, gender);
	pstmt.setString(4, email);
	pstmt.setString(5, id);
	//실행
	pstmt.executeUpdate();
	
	session.setAttribute("name", name);//세션값 name도 수정하기
	//main.jsp 로 이동
	%>
	<script>
	alert('회원정보 수정됨');
	location.href='main.jsp';
	</script>
	
	<%
	}else{
		%>
		<script>
		alert('패스워드가 다릅니다');
		history.back();
		</script>
		<%
	}
}



%>

<%
rs.close();
pstmt.close();
con.close();
%>









