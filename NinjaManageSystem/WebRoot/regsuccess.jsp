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
    
    <title>My JSP 'regsuccess.jsp' starting page</title>
    
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
      注册成功，您好，<s:property value="ninja.NinjaName"/>
   <br>
  你的信息如下：
  <table border="5">
  <tr>
  <th>NinjaName</th>
  <th>NinjaSex</th>
  <th>NinjaAge</th>
  </tr>
  <tr>
  <td><s:property value="ninja.NinjaName"/></td>
     <td><s:property value="ninja.NinjaSex"/></td>
       <td><s:property value="ninja.NinjaAge"/></td>    

  </tr>
  
  </table>
  <a href=index.jsp>返回</a>
  </center>
  </body>
</html>
