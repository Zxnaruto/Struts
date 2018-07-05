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
    
    <title>My JSP 'primaryninja.jsp' starting page</title>
    
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
   欢迎登陆，您好，<s:property value="ninja.NinjaName"/>
   <br>
  你的信息如下：
  <table border="5">
  <tr>
  <th>NinjaId</th>
  <th>NinjaName</th>
  <th>NinjaSex</th>
  <th>NinjaAge</th>
  <th>NinjaLevel</th>
  </tr>
  <tr>
  <td>${id}</td>
     <td>${name}</td>
       <td>${sex}</td>    
         <td>${age}</td>
           <td>${level}</td>  
  </tr>
  
  </table>
<!-- 
<s:form method="post" action="primary_play">
    <s:submit value="查询"/> 
    </s:form> 
    -->

  <a href="<%=request.getContextPath() %>/senior_play.action">查询所有上忍信息</a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href=PasswordUpdate.jsp>修改密码</a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href=index.jsp>退出</a>
  </center>
  </body>
</html>
