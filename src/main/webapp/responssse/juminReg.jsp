<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주민등록번호</title>
</head>
<body>
	<h1>주민번호</h1>
	<%
	String n1 = request.getParameter("num1");
	String n2 = request.getParameter("num2");
	
	int pp = n2.charAt(0)-'0';
	
	String goUrl="";
	
	if(pp==1 || pp==3) {
		goUrl = "info/men.jsp";
	} 
	if(pp==2 || pp==4) {
		goUrl = "info/wo.jsp";
	} else {
		goUrl = "info/asd.jsp";
	}
	
	
	response.sendRedirect(goUrl);
	%>
	<%= pp %>
	
</body>
</html>