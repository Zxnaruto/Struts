<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ok.jsp' starting page</title>
    
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
    恭喜用户：<s:property value="user.name" />，登陆成功！你的信息如下：<br>
   姓名：<s:property value="user.name" /> <br>
   年龄：<s:property value="user.age" /> <br>
   邮箱：<s:property value="uesr.email" /> <br>
   手机号码：<s:property value="user.phone" /><br>
   <!-- 跳回主页 -->
   <a href="<%=request.getContextPath() %>/forward.action">forward</a><br>
   <!-- 错误页面跳转，当访问的action不存在时跳转到该页面 -->
    <a href="<%=request.getContextPath() %>/errortest.action">errortest</a>
  </body>
</html>
