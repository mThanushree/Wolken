package com.wolk.cars;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarutiServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head>")
		writer.println("<title>BMW cars</title>");
		writer.println("</head>")
		writer.println("<body>BMW cars price in India starts at Rs. 39.50 Lakh for X1 and goes upto "
				+ "Rs. 2.46 Crore for 7 Series. In total BMW sells 18 new car models powered by ");
				
		writer.println("</head>");
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
}