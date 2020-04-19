import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=GBK");
	        response.setCharacterEncoding("UTF-8");
	        PrintWriter out = response.getWriter();
	        request.getRequestDispatcher("link.html").include(request, response);
	        String name = request.getParameter("name");
	        String password = request.getParameter("password");
	        if (password.equals("wzy1718064054")) {
	            out.print("登录成功~网络 1702王卓言");
	            out.print("<br>您好,欢迎使用！！！" );
            Cookie ck = new Cookie("name", name);
	            response.addCookie(ck);
	        } else {
	            out.print("抱歉，用户名或密码错误，请重新输入!");
	            request.getRequestDispatcher("login.html").include(request, response);
	        }
	        out.close();
	    }

	}
