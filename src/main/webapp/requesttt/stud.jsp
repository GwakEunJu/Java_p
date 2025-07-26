<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>stude</title>
</head>
<body>
	<h1>stud</h1>
	<%
		String pname = request.getParameter("pname");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		int tot = kor + eng + mat;
		int avg = tot / 3;
	%>
	
	<table border="">
		<tr>
			<td>이름</td>
			<td><%= pname %></td>
		</tr>
		<tr>
			<td>국어</td>
			<td align="center"><%= kor %></td>
		</tr>
		<tr>
			<td>영어</td>
			<td align="center"><%= eng %></td>
		</tr>
		<tr>
			<td>수학</td>
			<td align="center"><%= mat %></td>
		</tr>
		<tr>
			<td>총점</td>
			<td align="center"><%= tot %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td align="center"><%= avg %></td>
		</tr>
	</table>
</body>
</html>