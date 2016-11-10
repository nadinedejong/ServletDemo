package nl.youncapital.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/a")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html><html><head>"+
				"<title>A</title>"+ 
				"</head><body>Het Formulier:<br>"
				+ "<form method=\"post\" action=\"/ServletDemo/b\">"
				+ "<input type=\"radio\" name=\"keuze\"  value=\"200\">200<br> "
				+ "<input type=\"radio\" name=\"keuze\"  value=\"400\">400<br> "
				+ "<input type=\"radio\" name=\"keuze\"  value=\"404\">404<br> "
				+ "<input type=\"radio\" name=\"keuze\"  value=\"418\">418<br> "
				+ "<input type=\"radio\" name=\"keuze\"  value=\"500\">500<br> "
				
				+ "<input type= =\"text\" name=\"getal 1\">&nbsp"
				+ "<select name= \"middenstuk\"> "
				+ "<option value=\"+\">+</option>"
				+ "<option value=\"-\">-</option>"
				+ "<option value=\"*\">*</option>"
				+ "<option value=\"/\">/</option>"
				+ "</select>&nbsp"
				+ "<input type=\"text\" name=\"getal 2\"><br>"
				
				
				+ "<input type=\"submit\">"
				+ "</form>"
				+ "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
