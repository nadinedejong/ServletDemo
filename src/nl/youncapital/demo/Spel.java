package nl.youncapital.demo;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Spel
 */
@WebServlet("/Spel")
public class Spel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Random rand = new Random();
	static int secret = rand.nextInt(100);
	static int tries = 0;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		
		response.getWriter().append("<!DOCTYPE html><html><head>"+
				"<title>Say what??</title>"+ 
				"</head><body><h1> </h1>"+
				"</body></html>");
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
