

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

        //�����ж��Ƿ��Ǵӵ�¼ҳ��¼��һЩ������ֱ���ж��Ƿ���session�������������¼�ɹ����˻ص�¼ҳ���µ�¼������������Ҳ���¼�ɹ�����Ϊ��ʱsession���ڣ���ֱ��������֤��¼�ɹ��ˣ����������Ҳ������ַ�����ֱ���ж��Ƿ��Ǵӵ�¼ҳ��¼�ġ�
        String loginName = request.getParameter("loginName");//��ȡ��¼ҳ���û���������
        String password = request.getParameter("password");
        if(loginName!=null && password!=null){              //����ȡ��������Ϣ��˵�����ڵ�¼ҳ��֤��¼
            if("��׿��".equals(loginName) && "wzy".equals(password)){//��֤ͨ��
                session.setAttribute("loginUser",loginName);
                chain.doFilter(request, response);
            }
            else{   //�û������������
                request.getRequestDispatcher("/index.html").forward(request, response);
            }
        }
        else if(session.getAttribute("loginUser")!=null){//���Ǵӵ�¼ҳ��ȥ�ģ��������ѵ�¼���ı�־�����Կ��Խ�ȥ
            chain.doFilter(request, response);
        }
        else {//û�о�����¼��֤
            request.getRequestDispatcher("/index.html").forward(request, response);
        }       
    }
    public void destroy() {
        // TODO Auto-generated method stub      
    }
}
