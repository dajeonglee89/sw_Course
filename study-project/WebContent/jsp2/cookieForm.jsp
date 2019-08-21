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
String language = "korean";

//쿠키값 가져오기
Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("language")){
			language = cookie.getValue();
		}
	}
}

%>
<%=language %>

	<%
		if (language.equals("korean")) {
	%><h2>이다정이다정 아싸금요일이당주말주말</h2>
	<%
		} else {
	%><h2>HELLO DAJEONG</h2>
	<%
		}
	%>

	<form action="cookieProcess.jsp" method="get">
		<input type="radio" name="lang" value="korean" <%if(language.equals("korean")){ %> checked<% } %>/> 한국어 페이지 보기
	 	<input type="radio" name="lang" value="english" <%if(language.equals("english")){ %>checked<% } %>/> 영어 페이지 보기 <br>
		<button type="submit">언어설정</button>
	</form>

</body>
</html>