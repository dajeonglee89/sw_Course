<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
p{
font-familiy: "궁서체";
color: blue;
font-weight: bold;
background-color: yellow;
}
</style>

</head>
<body>
<%!

// 변수선언해서 값넣기 
// 문자열 id  문자열 passwd  정수형 age
// "myid"   "mypasswd"   20

// 클라이언트(브라우저)로 출력 (표현식, out 출력객체)
// "id님의 패스워드는 passwd이고, 나이는 age입니다.<br>"
String id ="이다정";
String passwd ="my passwd";
int age =20;
%>

<% 
out.println(id+"님의 패스워드는 "+passwd+"이고, 나이는 "+age+"입니다."+"<br>");
%>

<br><br><br>

<p>
<%=id %>님의 패스워드는 <%=passwd %>이고, <br>
나이는 <%=age %>입니다<br>
</p>

</body>
</html>