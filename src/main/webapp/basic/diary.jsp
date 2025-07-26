<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>달력</title>
<style>
	img {
		width: 400px
		
	}
	
	tr> td:nth-of-type(7n+1) {
		color:#f00;
	}

	tr> td:nth-of-type(7) {
		color:#00f;
	}	

	.today {
		background-color: #ff0;
	}

	.h2 {
		color: black;
	}

</style>
</head>

<h1>1년 달력</h1>
<% for(int k =1; k <12; k++) {
	Date now = new Date();

	int today =  now.getDate();
	int month = now.getMonth();
	//ystem.out.println(month);
	
	
	//System.out.println(today);
	String title = new SimpleDateFormat("yyy년").format(now);
	String mm = (k+"월");
	
	
	
	Calendar nowCa = Calendar.getInstance();
	
	// 이번달의 마지막 날
	int last = nowCa.getActualMaximum(Calendar.DATE);
	
	// 1일 요일번호
	now.setDate(1);
	int first = now.getDay();
	//System.out.println(first);
 %>
<body>
	
	<table border="">
		<tr align="center">
			<td colspan="7"><h2 class="h2" ><%=title %> <%=mm%></h2></td>
		</tr>
		<tr align="center">
			<td colspan="7">
				<img src="../fff/chunsik-춘식.gif"  alt="춘식"/>
			</td>
		</tr>
		<tr align="center">
			<td>일</td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td>토</td>
		</tr>
		<tr align="center">
		
		<!--  1일 앞 요일 빈칸 넣기 -->
		<% for(int i = 0; i<first; i++)	{%>
			<td></td>	
	
		<%}
		
		// 달력 일자 반복
		for(int i =1; i<=last; i++) {
			now.setDate(i);
			//System.out.println(now.getDay());
			
			String bg = "";
			
			if(i == today && k == month) {
				bg = "class='today'";
			}
			
		%>
			<td <%=bg %> ><%=i %></td>
			
			<% if(now.getDay()==6) { %>
			
			</tr><tr align="center">
			<%} } } %>
		</tr>
		
	</table>

</body>
</html>