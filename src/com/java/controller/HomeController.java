package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/home")
public class HomeController extends GenericServlet {

	private static final long serialVersionUID = -1375122837555422279L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter writer= response.getWriter();
		writer.println("<form action='./addEmployee' method='post'>");
		writer.println("Enter username:");
		writer.println("<input type='text' name='username'><br/>");
		writer.println("Enter password:");
		writer.println("<input type='password' name='password'><br/>");
		writer.println("<input type='submit'>");
		writer.println("</form>");
	}
}

