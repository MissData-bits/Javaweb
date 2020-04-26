import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=utf-8");
	        response.setCharacterEncoding("utf-8");
	        PrintWriter out = response.getWriter();
	        request.getRequestDispatcher("link.html").include(request, response);
	        String name = request.getParameter("name");
	        String password = request.getParameter("password");
	        if (password.equals("wzy")) {
	            out.print("您好, " + "王卓言同学,欢迎使用！！！");
	            HttpSession session = request.getSession();
	            session.setAttribute("name", name);
	        } else {
	            out.print("抱歉，用户名或密码错误!！！");
	            request.getRequestDispatcher("login.html").include(request, response);
	        }
	        out.close();
	    }
	}
