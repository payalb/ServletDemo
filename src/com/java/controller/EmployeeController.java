package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/addEmployee",initParams=
										{@WebInitParam(name="username", value="Payal"),
										@WebInitParam(name="password", value="Payal")})
public class EmployeeController implements Servlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer=response.getWriter();
		writer.println(request.getParameter("username"));
		writer.println(request.getParameter("password"));
		request.getRequestDispatcher("demo").forward(request, response);
	}


	ServletConfig config;
	@Override
	public void destroy() {
		System.out.println("destroyed");
	}
	@Override
	public ServletConfig getServletConfig() {
		return config;
	}
	@Override
	public String getServletInfo() {
		return "This is the employee  reuqest manager";
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config= config;
		System.out.println("Initialized");
	}
}
