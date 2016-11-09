package nl.youncapital.demo;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Opdracht
 */
@WebServlet("/Opdracht")
public class Opdracht extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html><html><head>"+
		"<title>Say what??</title>"+ 
		"</head><body><h1>Het is "+ LocalTime.now() +"</h1>"+
		"</body></html>");
	}



}
