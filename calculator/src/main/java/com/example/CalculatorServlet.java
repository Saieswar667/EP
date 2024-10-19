package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String num1 = request.getParameter("num1");
	  String num2 = request.getParameter("num2");
		 String operation = request.getParameter("operation");

		double result = 0;

		if (operation.equals("add")) {
		 result = Double.parseDouble(num1) + Double.parseDouble(num2);
		} else if (operation.equals("subtract")) {
		 result = Double.parseDouble(num1) - Double.parseDouble(num2);
		} else if (operation.equals("multiply")) {
		 result = Double.parseDouble(num1) * Double.parseDouble(num2);
		 } else if (operation.equals("divide")) {
		 result = Double.parseDouble(num1) / Double.parseDouble(num2);
		 }

		 pw.print("<html><body>");
		 pw.print("<h1>Calculator Result</h1>");
		 pw.print("<p>Result: " + result + "</p>");
		 pw.print("</body></html>");
	}

	

}
