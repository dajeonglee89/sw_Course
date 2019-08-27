package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 톰캣 서버(WAS)가 기동되면 
 서비스할 프로젝트 안에 있는 서블릿 클래스들을 확인함.
 서블릿 클래스에 붙은 @WebServlet 애노테이션 값을 확인해서
 해당 애노테이션 값("/dajeonglee.html")으로 해당 서블릿(MyServlet) 클래스가 요청받을 수 있도록
 미리 준비함.
 */

@WebServlet("/dajeonglee.html")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 10;
		int num2 = 20;
		int add = num1 + num2;
		
		//스크립트릿 안에서 만든 변수는 지역변수
		 String str = " Server Page ";
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>제목</title></head>");
		out.println("<body>");
		out.println("<p>" + num1 + " + " + num2 + " = " + add);
		out.println(str);
		out.println("<br>");
		
		out.println("getName()");
		out.println("<br>");
		
		out.println(1+2);
		out.println("<br>");
		
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
