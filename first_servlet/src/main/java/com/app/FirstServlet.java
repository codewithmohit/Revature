package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();
		out.print("<h1>" + context.getInitParameter("query0") + "</h1>");

		ServletConfig config = getServletConfig();
		out.print("<h1>" + config.getInitParameter("query1")+" " + config.getInitParameter("query2") + "</h1>");

		out.print("<h1>Welcome It is Get Method!!!!</h1>");
		out.print("<h1>" + request.getParameter("fname") +" " + request.getParameter("lname") + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//  Servlet context Concept Implemented
		ServletContext context = getServletContext();
		out.print("<h1>" + context.getInitParameter("query0") + "</h1>");
		//  Servlet Config Concept Implemented	
		ServletConfig config = getServletConfig();
		out.print("<h1>" + config.getInitParameter("query1") + " " + config.getInitParameter("query2") + "</h1>");

		out.print("<h1>Welcome It is Post Method!!!!</h1>");
		out.print("<h1>" + request.getParameter("pfname") + " " + request.getParameter("plname") + "</h1>");

	}

}