package com.chensi;
 
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet 获得填写的表单数据
 */
@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //获取传过来的表单数据,根据表单中的name获取所填写的值
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String strings = (String) names.nextElement();
            String[] parameterValues = request.getParameterValues(strings);
            for (int i = 0;parameterValues!=null&&i < parameterValues.length; i++) {
                System.out.println(strings+":"+parameterValues[i]+"\t");
            }
        }
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
 
}