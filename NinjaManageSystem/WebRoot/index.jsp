<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
  
  <body style="background: url(images/6.jpg)">
  <br><br><br><br><br><br>
   <center>
    <h1>Ninja Management System</h1>
    <s:form method="post" action="login" >
    <s:textfield name="ninja.NinjaName" label="忍者姓名" />
    <s:password name="ninja.NinjaPassword" label="登陆密码"/>
    <br>
    <s:submit value="登陆" align="center"/>
    </s:form>
      <a href=register.jsp>新忍者注册</a>
      </center>
  </body>
</html>
