package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 ��Ĺ ����(WAS)�� �⵿�Ǹ� 
 ������ ������Ʈ �ȿ� �ִ� ���� Ŭ�������� Ȯ����.
 ���� Ŭ������ ���� @WebServlet �ֳ����̼� ���� Ȯ���ؼ�
 �ش� �ֳ����̼� ��("/dajeonglee.html")���� �ش� ����(MyServlet) Ŭ������ ��û���� �� �ֵ���
 �̸� �غ���.
 */

@WebServlet("/dajeonglee.html")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 10;
		int num2 = 20;
		int add = num1 + num2;
		
		//��ũ��Ʈ�� �ȿ��� ���� ������ ��������
		 String str = " Server Page ";
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>����</title></head>");
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
