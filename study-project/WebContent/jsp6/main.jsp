<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	border: 1px solid yellowgreen;
}

div#container {
	width: 1024px;
	height: 500px;
	background-color: blue;
	margin-left: auto;
	margin-right: auto;
}

nav {
	width: 250px;
	height: 300px;
	background-color: red;
	float: left;
}

section {
	width: 750px;
	height: 500px;
	background-color: green;
	float: right;
}

footer {
	clear: both;
}
</style>

</head>
<body>
	<div id="container">
		<header>
			<%--<%@ include file="header.jsp" %>--%>
			<jsp:include page="header.jsp">
			<jsp:param value="id" name="admin"/>
			</jsp:include>
		</header>

		<nav>
		<jsp:include page="nav.jsp" />
		</nav>
		
		<section>본문내용</section>

		<h1>main.jsp</h1>


		<footer>
			<jsp:include page="footer.jsp" />
		</footer>

	</div>
</body>
</html>