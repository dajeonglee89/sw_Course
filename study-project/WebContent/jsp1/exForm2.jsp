<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>exForm2.jsp</h1>

	<form action="exProcess2.jsp" method="post">
		<input type="text" name="name" placeholder="이름입력"><br>
		<input type="number" name="age" min="0" max="120" placeholder="나이입력"><br>
		<button type='submit'>전송</button>
	</form>




</body>
</html>