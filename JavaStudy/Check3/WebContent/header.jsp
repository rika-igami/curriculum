<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
      <label>login</label>
      <label><% Calendar calendar = Calendar.getInstance();
      		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
      		
      		String formatDate = simpleDateFormat.format(calendar.getTime());
      		
 
      		%>
      		<%= formatDate %></label>
    </div>

<!-- </body>
</html> -->