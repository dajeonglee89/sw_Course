<%@page import="com.exam.vo.MemberVO"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%  
    //세션값가져오기
MemberVO loginMember = (MemberVO) session.getAttribute("loginMember");
// 세션값 없으면 loginForm.jsp로 이동
if(loginMember == null){
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<%
//passwd 파라미터값 가져오기
String passwd = request.getParameter("passwd");

//DAO 준비
MemberDao memberDao = MemberDao.getInstance();

int check = memberDao.userCheck(loginMember.getId(), passwd);

if(check == 1){
	//DB회원정보 삭제
	memberDao.deleteMember(loginMember.getId()); 
	//세션값 초기화
	session.invalidate();
	%>
	<script>
		alert('회원삭제성공');
		location.href='loginForm.jsp';
		</script>
	<%	
}else {
	%>
	<script>
	alert('패스워드가 다릅니다.');
	history.back();
	</script>
	<%
}
%>

