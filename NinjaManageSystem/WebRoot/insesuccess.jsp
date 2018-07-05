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
    
    <title>My JSP 'delerror.jsp' starting page</title>
    
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
  插入成功！！！
   <br>
  您插入的信息如下：
  <table border="5">
  <tr>
  <th>NinjaName</th>
  <th>NinjaSex</th>
  <th>NinjaAge</th>
  <th>NinjaLevel</th>
  <th>NinjaPassword</th>
  </tr>
  <tr>
  <td><s:property value="ninja.NinjaName"/></td>
     <td><s:property value="ninja.NinjaSex"/></td>
       <td><s:property value="ninja.NinjaAge"/></td>    
       <td><s:property value="ninja.NinjaLevel"/></td> 
       <td><s:property value="ninja.NinjaPassword"/></td> 
  </tr>
  
  </table>
  <a href="javascript:history.go(-2)">返回</a>
  </center>
  </body>
</html>
