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
    
    <title>My JSP 'PasswordUpdate.jsp' starting page</title>
    
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
   <h3>更新忍者等级</h3>
    <s:form method="post" action="upda">
    <s:textfield name="ninja.NinjaId" label="修改等级忍者的编号" />
     <s:textfield name="ninja.NinjaLevel" label="修改等级" />
    <s:submit value="修改" align="center"/>
     </s:form>
     
    <a href="javascript:history.go(-1)">返回</a>
    </center>
  </body>
</html>
