

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")

public class Servlet2 extends HttpServlet {
    String value;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			value=(String) this.getServletContext().getAttribute("111");
		    response.getOutputStream().write(value.getBytes());
	
 
	}
 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
		//response.getOutputStream().write(value.getBytes());
		//doGet(request, response);
 
	}
	
 
}
