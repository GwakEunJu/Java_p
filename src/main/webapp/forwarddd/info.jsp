<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*						key,  value					*/
	request.setAttribute("title", "회사소개");
	request.setAttribute("mainUrl", "service/infoView.jsp");
%>

<jsp:forward page="views/template.jsp"/>