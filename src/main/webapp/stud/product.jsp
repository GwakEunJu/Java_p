<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("title", "제품");
	request.setAttribute("mainUrl", "serviceee/productView.jsp");
%>

<jsp:forward page="forward/bread.jsp" />