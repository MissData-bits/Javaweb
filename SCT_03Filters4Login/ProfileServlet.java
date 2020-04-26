import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=utf-8");
	        response.setCharacterEncoding("utf-8");
	       
	        PrintWriter out = response.getWriter();
	        request.getRequestDispatcher("link.html").include(request, response);
	        HttpSession session = request.getSession(false);
	        if (session != null) {
	            String name = (String) session.getAttribute("name");
	            out.print("您好, " + name + " 欢迎来到个人页面");
	        } else {
	            out.print("需要先登录系统~");
	            request.getRequestDispatcher("login.html").include(request, response);
	        }
	        out.close();
	    }
}