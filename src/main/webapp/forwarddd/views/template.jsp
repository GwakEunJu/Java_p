<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	/*다시 체크 이해필요*/
    	String mainUrl = (String)request.getAttribute("mainUrl");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title><%=request.getAttribute("title") %></title>

<style>
* {
	margin: 0;
	padding: 0;
}

.wrapper {
	width: 1200px;
	height: 750px;

	margin: auto;
}

section {
	width: 100%;
	height: 500px;
	background-color: #fff;
}

</style>
</head>
<body>
	<div class="wrapper">
		<jsp:include page="header.jsp" />
		<section><jsp:include page="<%=mainUrl %>" /></section>
		<jsp:include page="footer.jsp" />
	</div>
</body>
</html>