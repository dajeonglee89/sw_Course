<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World</h1>

<!-- 뭐 -->
<%-- JSP주석 -> %는 자바이니까니 자바주석으로 바뀌는거임--%>

<%
 //스크립트릿 
 /*
 범위주석
 */
 
 System.out.println("서버 콘솔출력");
 
 String str = "문자열";
 
 Date d = new Date(); //오늘날짜 객체 생성
 
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh시 mm분 ss초");
 String strDate = sdf.format(d);
 
%>

출력 : <%=str %><br><%-- 표현식 --%>
오늘날짜 : <%=strDate %>

</body>
</html>