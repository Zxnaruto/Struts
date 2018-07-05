<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'primary_show.jsp' starting page</title>
    
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
    信息如下：

  <table border="5">
  <tr>
  <th>NinjaId</th>
  <th>NinjaName</th>
  <th>NinjaSex</th>
  <th>NinjaAge</th>
  <th>NinjaLevel</th>
  </tr>
<!-- ninja.ninjaId 中后缀要符合NinjaMessage中括号中的书写形式 -->
  <c:forEach items="${list}" var="ninja">
   <tr>
  <td>${ninja.ninjaId}</td>
     <td>${ninja.ninjaName}</td>
       <td>${ninja.ninjaSex}</td>    
         <td>${ninja.ninjaAge}</td>
           <td>${ninja.ninjaLevel}</td>  
  </tr>
  </c:forEach>
 
  
  </table>
  <a href="javascript:history.go(-1)">返回</a>
  </center>
  </body>
</html>
