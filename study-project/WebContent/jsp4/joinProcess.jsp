<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- post 파라미터값 한글처리 --%> 
<% request.setCharacterEncoding("utf-8"); %>

<%-- 액션태그로 자바빈 객체 생성--%>
<jsp:useBean id="memberVO" class="com.exam.vo.MemberVO"/>

<%-- 액션태그로 파라미터값 찾아서 자바빈 객체에 저장--%>
<jsp:setProperty property="*" name="memberVO"/>

<%-- 가입날짜 생성해서 채우기 --%>
<% memberVO.setRegDate(new Timestamp(System.currentTimeMillis())); %>


<%-- 액션태그로 자바빈 값 각각 출력 --%>

아이디: <jsp:getProperty property="id" name="memberVO"/><br>
패스워드:<jsp:getProperty property="passwd" name="memberVO"/><br>
이름:<jsp:getProperty property="name" name="memberVO"/><br>
나이:<jsp:getProperty property="age" name="memberVO"/><br>
성별:<jsp:getProperty property="gender" name="memberVO"/><br>
이메일:<jsp:getProperty property="email" name="memberVO"/><br>
가입날짜: <jsp:getProperty property="regDate" name="memberVO"/><br>

