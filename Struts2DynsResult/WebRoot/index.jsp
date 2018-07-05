<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <div style="border: solid 1px black;width: 300px;height: 200px;margin: 0 auto">
   <form action="DynaResult.action" method="post">
   用户名 &nbsp;&nbsp;:<input type="text" name="user.name" /><br/>
   年 &nbsp;&nbsp;&nbsp;&nbsp;龄:<input type="text" name="user.age" /><br/>
  Email &nbsp;&nbsp;&nbsp;:<input type="text" name="user.email" /><br/>
  手机号码:<input type="text" name="user.phone" /><br/>
  <input type="submit" value="提交"/>
   </form>
   </div>
  </body>
</html>
