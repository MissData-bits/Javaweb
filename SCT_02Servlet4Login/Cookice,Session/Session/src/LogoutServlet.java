import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=utf-8");
	        response.setCharacterEncoding("utf-8");
	        PrintWriter out = response.getWriter();
	        request.getRequestDispatcher("link.html").include(request, response);
	        HttpSession session = request.getSession();
	        session.invalidate();
	        out.print("您已成功注销!");
	        out.close();
	    }
	}