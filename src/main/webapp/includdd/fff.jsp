<%@page import="java.util.Arrays"%>
<%@page import="java.sql.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%	// parameter가 중첩될 경우 가강 가까운 parameter 호출 %>
fff 시작 -------------<br/>
	pid : <%=request.getParameter("pid") %><br/>
	age : <%=request.getParameter("age") %><br/>
	gender : <%=request.getParameter("gender") %><br/>
	hobby : <%=request.getParameter("hobby") %><br/>
	
	<%
		String [] arr = request.getParameterValues("pid");
	
	%>
	arr : <%= Arrays.toString(arr) %><br/>
	
fff 끝 -------------<br/>