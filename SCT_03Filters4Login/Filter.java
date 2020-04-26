

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;  
/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/Filter")
public class Filter implements javax.servlet.Filter {

	public void init(FilterConfig config) throws ServletException{

    }
    public void doFilter(ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException,ServletException{
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();

        //用来判断是否是从登录页登录，一些文章是直接判断是否有session，但这样如果登录成功后退回登录页重新登录，如果密码错误也会登录成功，因为此时session还在，就直接跳过验证登录成功了，所以这里我采用这种方法，直接判断是否是从登录页登录的。
        String loginName = request.getParameter("loginName");//获取登录页的用户名和密码
        String password = request.getParameter("password");
        if(loginName!=null && password!=null){              //可以取到表单的信息，说明正在登录页验证登录
            if("王卓言".equals(loginName) && "wzy".equals(password)){//验证通过
                session.setAttribute("loginUser",loginName);
                chain.doFilter(request, response);
            }
            else{   //用户名或密码错误
                request.getRequestDispatcher("/index.html").forward(request, response);
            }
        }
        else if(session.getAttribute("loginUser")!=null){//不是从登录页进去的，但存在已登录过的标志，所以可以进去
            chain.doFilter(request, response);
        }
        else {//没有经过登录验证
            request.getRequestDispatcher("/index.html").forward(request, response);
        }       
    }
    public void destroy() {
        // TODO Auto-generated method stub      
    }
}
