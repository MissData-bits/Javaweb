<%@ page language="java" contentType="text/html"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta >
<title>Insert title here</title>
</head>
<body>
 <form action="main.jsp" method="POST">
        名字: <input type="text" name="username"> <br /> 
        城市: <input type="text" name="city" />  <br/>
        性别:<input type="radio" name="sex" value="man" checked="checked">man
       <input type="radio" name="sex" value="woman">woman   <br/>        
        爱好:<input type="checkbox" name="habit" value="pingpang">pingpang
            <input type="checkbox" name="habit1" value="basketball">basketball
            <input type="checkbox" name="habit2" value="football">football
            <input type="checkbox" name="habit3" value="run">run<br/> 
        城市:<select name="chengshi">
                 <option>---请选择---</option>
                 <option value="beijing">北京</option>
                 <option value="shanghai">上海</option>
                 <option value="shengyang">沈阳</option>
               </select>         
            
           <input type="submit" value="提交" />
    </form>
</body>
</html>