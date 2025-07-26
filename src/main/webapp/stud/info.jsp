<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setAttribute("title","빵집소개");
	request.setAttribute("mainUrl","serviceee/infoView.jsp");
%>    

<jsp:forward page="forward/bread.jsp"/>