<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    	String pname =null;
    	
    	if(request.getCookies()!=null) {
    	for(Cookie coo : request.getCookies()) {
    		if(coo.getName().equals("pname")) {
    			pname=coo.getValue();
    		}
    		
    	}
    }
    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 메인</title>
</head>
<body>
	<h1>로그인 메인</h1>
	<% if(pname==null) { //로그인 되지 않은 경우	%>	
	<form action="loginReg.jsp" method="post">
		<fieldset><label for="pid">아이디</label><input type="text" name="pid" id="pid"/></fieldset>
		<fieldset><label for="pw">암호</label><input type="text" name="pw" id="pw"/></fieldset>
		<fieldset><input type="submit" value="로그인"/></fieldset>
	</form>
	
	<% } else { // 로그인 된 경우 %>
	<%=pname %>님 안녕하세요 <a href="logout.jsp">로그아웃</a>
	<% } %>
</body>
</html>