package nl.youncapital.demo;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formb
 */
@WebServlet("/bd")
public class Sevlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("formulier ontvangen, waarde: " + request.getParameter("keuze"));
		// bereken de uitkomst
		String getall1 = (request.getParameter("getal 1"));
		String getall2 = (request.getParameter("getal 2"));
		String midden = (request.getParameter("middenstuk"));
		int antwoord = 0;
		int g1 = Integer.parseInt(getall1);
		int g2 = Integer.parseInt(getall2);
		if (midden.equals("+"))antwoord = g1 + g2;
		else if (midden.equals("-"));
		
		response.getWriter().append("<!DOCTYPE html><html><head>"+
				"<title>Say what??</title>"+ 
				"</head><body><h1>Het is "+ antwoord +" </h1>"+
				"</body></html>");
	}

}
