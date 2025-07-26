<%@page import="java.util.Arrays"%>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>req 입니다</title>
</head>
<body>
	<h1>req 입니다</h1>
	<%
		// select * from member where id is not null
		HttpServletRequest myReq = request;
		ServletRequest myReq2 = pageContext.getRequest();	// 내장객체를 다 줌. 
		out.println(request+"<br/>");
		out.println(myReq+"<br/>");
		out.println(myReq2+"<br/>");
		out.println(request.getRemoteAddr()+"<br/>");
		out.println(request.getRemoteHost()+"<br/>");
		out.println(request.getRemoteUser()+"<br/>");
		out.println(request.getProtocol()+"<br/>");
		out.println(request.getServerName()+"<br/>");
		out.println(request.getMethod()+"<br/>");	// get , post 확인
		out.println(request.getContentType()+"<br/>");
		out.println(request.getContentLength()+"<br/>");
		out.println(request.getRequestURL()+"<br/>");
		out.println(request.getRequestURI()+"<br/>");
		out.println(request.getContextPath()+"<br/>");
		out.println(request.getCharacterEncoding()+"<br/>");
		out.println(request.getHeader("refer")+"<br/>");
		out.println(request.getHeader("User-Agent")+"<br/>");
		
		//quiry   %EC%9E%A5   %EB%8F%99   %EA%B1%B4 = 장동건
		//http://localhost:8080/jspPrj/requesttt/req.jsp?no=123&pname=%EC%9E%A5%EB%8F%99%EA%B1%B4&marriage=true&hobby=coding&hobby=debug
		
		out.println(request.getParameter("no")+"<br/>");	// 여기부터 중요
		out.println(request.getParameter("pname")+"<br/>");
		out.println(request.getParameter("marriage")+"<br/>");
		boolean bb = Boolean.parseBoolean(request.getParameter("marriage"));
		out.println(!bb+"<br />");
		out.println(request.getParameter("hobby")+"<br/>");
		out.println(request.getParameter("hobby")+"<br/>");
		String [] hobbyArr = request.getParameterValues("hobby");
		out.println(Arrays.toString(hobbyArr)+"<br />");
	%>
</body>
</html>