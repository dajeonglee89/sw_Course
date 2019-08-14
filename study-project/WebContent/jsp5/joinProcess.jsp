<%@page import="com.exam.vo.MemberVO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%-- post 파라미터값 한글처리--%>    
<% request.setCharacterEncoding("utf-8");%>


<%
//파라미터값을 저장할 VO객체 준비
//MemberVO memberVO = new MemberVO();
%>
<jsp:useBean id="memberVO" class="com.exam.vo.MemberVO"/>


<%
//파라미터값 가져오기
String id = request.getParameter("id");
memberVO.setId(id);

memberVO.setPasswd(request.getParameter("passwd"));
%>

<jsp:setProperty property="*" name="memberVO"/>


<%
System.out.println(memberVO);


%>




