<%@page import="basic_p.ReqStudDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>stud2</title>

</head>
<body>
	<h1>stud2</h1>
	<% 
	
		ReqStudDTO dto = new ReqStudDTO(
				request.getParameter("pname"),
				request.getParameter("kor"),
				request.getParameter("eng"),
				request.getParameter("mat")
			);
	
	 %>
	 
	<%-- 캡슐화 Getter, Setter --%>
	
	<table border="">
	
		<tr>
			<td>이름</td>
			<td><%= dto.getPname() %></td>
		</tr>
		<tr>
			<td>국어</td>
			<td align="center"><%= dto.getKor() %></td>
		</tr>
		<tr>
			<td>영어</td>
			<td align="center"><%= dto.getEng() %></td>
		</tr>
		<tr>
			<td>수학</td>
			<td align="center"><%= dto.getMat() %></td>
		</tr>
		<tr>
			<td>총점</td>
			<td align="center"><%= dto.getTot() %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td align="center"><%= dto.getAvg() %></td>
		</tr>
		 
	</table>
	
	<table border="">
	
		<tr>
			<td>이름</td>
			<td><%= dto.getPname() %></td>
		</tr>
		<tr>
			<td>국어</td>
			<td align="center"><%= dto.getKor() %></td>
		</tr>
		<tr>
			<td>영어</td>
			<td align="center"><%= dto.getEng() %></td>
		</tr>
		<tr>
			<td>수학</td>
			<td align="center"><%= dto.getMat() %></td>
		</tr>
		<tr>
			<td>총점</td>
			<td align="center"><%= dto.getTot() %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td align="center"><%= dto.getAvg() %></td>
		</tr>
		 
	</table>
</body>
</html>