<%@ page language="java" contentType="text/html "
  pageEncoding="UTF-8"
%>
<%@ page import="java.io.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html ">
<title>GET方法处理URL的示例</title>
</head>
<body>
    <h3>JSP代码实现GET/POST方法处理URL的示例</h3>
    <ul>
        <li><p>
                <b>姓名:</b>
                <%= request.getParameter("username")%>
            </p></li>
        <li><p>
                <b>所在城市:</b>
                <%=request.getParameter("city")%>
            </p></li>
        <li><p>
                <b>性别:</b>
                <%=request.getParameter("sex")%>
            </p></li>
        <li><p>
                <b>爱好:</b>
                <%=request.getParameter("habit")%>
                <%=request.getParameter("habit1")%>
                <%=request.getParameter("habit3")%>
            </p></li>
         <li><p>
                <b>城市:</b>
                <%=request.getParameter("chengshi")%>
              
            </p></li>    
            
    </ul>
</body>
</html>