<%@page import="java.text.SimpleDateFormat"%>
<%--날짜 포멧을 지정하기 위해 import --%>
<%@page import="java.util.Calendar"%>
<%--Calendar 클래스를 사용하기 위해 import --%>
<%@page import="java.util.Date"%>
<%-- Date 클래스르르 사용하기 위해 import --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Date now = new Date(); // 현재 날짜와 시간 객체 생성						

SimpleDateFormat sdf = new SimpleDateFormat("MM_dd"); // "월_일" 형식으로 날짜 포맷 지정 
String today = sdf.format(now); // 오늘 날짜를  "MM_dd" 형태 문자열로 저장
System.out.println(today); // 콘솔에 출력 (서버 콘솔 기준)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1년 달력</title>
<style>
img {
	width: 400px;
	height : 300px
}

/*월요일 시작 열(td)의 택스트 색을 빨간색으로 (일요일)*/
.mm>td:first-of-type {
	color: #f00;
}
/*일곱 번째 열(td)의 텍스트 섹을 파란색으로 (토요일)*/
.mm>td:nth-of-type(7) {
	color: #00f;
}

/*오늘 날짜 배경색을 노란색으로*/
.today {
	background-color: #ff0;
}
</style>
</head>
<body>
	<table>
		<%
		for (int big = 1; big <= 12; big += 3) {	// 3개월씩 한 줄에 출력하기 위한 반복문
		%>
		<tr>
			<%
			for (int m = big; m < big + 3; m++) {	// 한 줄에 3개월 표시하기 위한 내부 반복문
				now.setMonth(m - 1);	// 월은 0부터 시작하므로 m-1

				now.setDate(1);	// 해당 월의 1일로 설정
				int first = now.getDay();	// 1일의 요일 (0=일 ~ 6=토)
				

				Calendar nowCa = Calendar.getInstance();	// Calendar 객체 생성

				nowCa.setTime(now);	// now(Date)를 Calendar에 설정

				// 이달의 마지막 날
				int last = nowCa.getActualMaximum(Calendar.DATE);	// 이 달의 마지막 날짜 구하기 
			%>
			<td valign="top">
				<table border="">
					<tr align="center">
						<td colspan="7"><h2><%=m%>월</h2></td>	<%-- 월 제목 출력 --%>			
					</tr>
					<tr>
						<td colspan="7"><img src="../fff/<%=m%>.gif" alt="" />
						</td> <%-- 월별 이미지 표시 --%>
						
					</tr>
					<tr class="mm" align="center">
						<td>일</td>
						<td>월</td>
						<td>화</td>
						<td>수</td>
						<td>목</td>
						<td>금</td>
						<td>토</td>
					</tr>
					<tr class="mm" align="center">
						<%
						// 1일 앞 요일 빈칸 넣기
						for (int i = 0; i < first; i++) {
						%>
						<td></td>
						<%
						}

						//달력 일자 반복
						for (int i = 1; i <= last; i++) {
						now.setDate(i); // 날짜를 i로 설정
						

						String bg = ""; // 배경클래스 초기화

						// 오늘 날짜와 일치하면 today 클래스 지정
						if (today.equals(sdf.format(now))) {
							bg = "class='today'";
						}
						%>
						<td <%=bg%>><%=i%></td>

						<%
						//토요일 마다 줄바꾸기
						if (now.getDay() == 6) {
						%>
					</tr>
					<tr align="center" class="mm">
						<% } } %>															
					</tr>
				</table>
			</td>
			<%
			} %>
		</tr>
		<%
		} %>	
	</table>

</body>
</html>