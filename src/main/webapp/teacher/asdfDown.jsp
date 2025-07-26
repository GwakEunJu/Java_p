<%@page import="java.util.Arrays"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String path = request.getServletContext().getRealPath("asdf"); // 파일의 목록을 가져오는 코드
	File [] arr = new File(path).listFiles();
	//System.out.println(Arrays.toString(arr));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>asdf</title>
</head>
<body>
<h1>asdf</h1>
<% for(File ff:arr) {
	if(ff.isFile()){ // 파일인지 확인 하는 코드
		
%>
<a href="/jspPrj/FileDown?fileName=<%=ff.getName() %>"><%=ff.getName() %></a><br/>
<%}} %>
</body>
</html>