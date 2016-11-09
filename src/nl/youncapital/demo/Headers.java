package nl.youncapital.demo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Headers
 */
@WebServlet("/Headers")
public class Headers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String test = "";
		String name = "<ul>";
		for (Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements();){
			name = e.nextElement();

			test += "<li>" + name +  ": " + request.getHeader(name);
			}
		name += "</ul>";
		response.getWriter().append("<!DOCTYPE html><html><head>"+
				"<title>De Headers</title>"+ 
				"</head><body>Het is:<br> "+ test +
				"</body></html>");
	}


}
