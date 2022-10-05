package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		PrintWriter out = response.getWriter();
		
		out.print("<form action=\"SecondServlet\">\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldA\" value=" +txtFieldA +">"
				+ "		Enter B: <input type=\"text\" name=\"textFieldB\" /></br>\r\n"
				+ "		<input type=\"submit\">\r\n"
				+ "	</form>");
		
	}

}
