<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册显示</title>

</head>
<body>
<%request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="person" class="come.wang.test.YhBean">
<jsp:setProperty name="person" property="*"/></jsp:useBean>
您的注册信息为：<br>
账号：<jsp:getProperty property="username" name="person"/><br>
密码：<jsp:getProperty property="password" name="person"/><br>
邮箱：<jsp:getProperty property="email" name="person"/><br>
地址：<jsp:getProperty property="dizhi" name="person"/><br>
</body>
</html>