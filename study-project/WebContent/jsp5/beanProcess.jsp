<%@page import="com.exam.vo.MyBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- post 파라미터값 한글처리 --%>
    <% request.setCharacterEncoding("utf-8"); %>


<%-- 파라미터값을 개별적인 변수에 따로 저장하는 방식 --%>    
<%--    <%
    // name,age 파라미터값 가져오기
    String name = request.getParameter("name");
    int age = Integer.parseInt(request.getParameter("age")); //타입변환 
    %> --%>  
        
<%-- 자바빈 객체 생성 --%>
<% //MyBean myBean = new MyBean(); %>

<%-- 액션태그로 자바빈 객체 생성 --%>
<jsp:useBean id="myBean" class="com.exam.vo.MyBean"/>


<%-- 파라미터값 찾아서 자바빈 객체 필드에 저장하기 --%>
<%
myBean.setName(request.getParameter("name"));
myBean.setAge(Integer.parseInt(request.getParameter("age")));
%>

<%-- 액션태그로 파라미터값 찾아서 자바빈 객체 필드에 저장하기 --%>
<%--<jsp:setProperty property="name" param="name" name="myBean"/>  --%>
<%--<jsp:setProperty property="name" name="myBean"/> --%>
<%-- <jsp:setProperty property="name" value="이다정" name="myBean"/> 앞에 set 있어서 property 에 age or name 만 적음--%>
<jsp:setProperty property="*" name="myBean"/> <%-- property="*" --> set제외한 필드이름 다 찾아줌 (ex name/age) --%>
<%-- 폼속성 네임값(name,age)과 필드에 네임값(name,age) 동일하게 하면 위에 *한줄로 다 가능함  --%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 이름: <%=name %><br>
나이: <%=age %><br>--%>

<%-- 이름 <%=myBean.getName() %><br>
나이 <%=myBean.getAge() %><br>--%>

이름 <jsp:getProperty property="name" name="myBean"/><br>
나이 <jsp:getProperty property="age" name="myBean"/><br>

</body>
</html>