<%@page import="basic_p.MemberDTO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
   		String pid = request.getParameter("pid");
    	String pw = request.getParameter("pw");
    	
    	String msg = "로그인 실패";
    	
    	if(pid.equals("aaa") && pw.equals("1111")) {
    		msg= "로그인 성공";
    		
    		Cookie coo = new Cookie("pname","장동건");
    		response.addCookie(coo);
    	}
    	if(pid.equals("bbb") && pw.equals("2222")) {
    		msg= "로그인 성공";
    		
    		Cookie coo = new Cookie("pname","장서건");
    		response.addCookie(coo);
    	}
    	if(pid.equals("ccc") && pw.equals("3333")) {
    		msg= "로그인 성공";
    		
    		Cookie coo = new Cookie("pname","장남건");
    		response.addCookie(coo);
    	}
    	if(pid.equals("ddd") && pw.equals("4444")) {
    		msg= "로그인 성공";
    		
    		Cookie coo = new Cookie("pname","장중건");
    		response.addCookie(coo);  		
    	}
    	
    	if(pid.equals("eee") && pw.equals("5555")) {
    		msg= "로그인 성공";
    		
    		Cookie coo = new Cookie("pname","북두신건");
    		response.addCookie(coo);
    	}
    	
    %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<h1>로그인 처리</h1>
	<script type="text/javascript">
		alert("<%=msg%>")
		location.href="loginMain.jsp"
	</script>
</body>
</html>