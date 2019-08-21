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
//세션 영역(Scope)객체 - Map 컬렉션으로 사용

//세션객체에 값 생성(추가)
session.setAttribute("name", "홍길동 세션값");
session.setAttribute("age", 33); //Integer로 저장


//앞에 화면으로 이동
//response.sendRedirect("sessionEX.jsp");
%>

<script>
alert('세션값 생성됨.');
location.href = 'sessionEX.jsp'
</script>

</body>
</html>