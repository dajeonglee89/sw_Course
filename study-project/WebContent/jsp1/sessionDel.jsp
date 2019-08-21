<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션값 한개 삭제
session.removeAttribute("name");

//response.sendRediRECT("sessionEx.jsp");

%>
<script>
alert('세션값 삭제됨');
location.href = 'sessionEx.jsp';
</script>