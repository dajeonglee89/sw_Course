<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- post 파라미터 한글처리--%>
<% request.setCharacterEncoding("utf-8");

//파라미터값 가져오기
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");

//DAO 객체 준비
MemberDao memberDao = MemberDao.getInstance();
//사용자 확인 메소드 호출
int check = memberDao.userCheck(id,passwd);
//check == 1 로그인 인증(세션값생성 "id"). index.jsp로 이동
//check == 0 "패스워드틀림" 뒤로이동
//check == -1 "아이디없음" 뒤로이동

if(check == 1){
	session.setAttribute("id", id);
	response.sendRedirect("../index.jsp");
	
}else if(check == 0){
	%>
	<script>
	alert('패스워드가 다릅니다.');
	history.back();
	</script>	
	<%
}else { //check == -1
	%>
	<script>
	alert('없는 아이디 입니다.');
	history.back();
	</script>	
	<%	
}

%>