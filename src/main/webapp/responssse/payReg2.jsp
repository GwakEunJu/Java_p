<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>payReg2</title>
</head>
<body>
	<h1>payReg2</h1>

	<%
	String pt = request.getParameter("pt");
	double money = Double.parseDouble(request.getParameter("money"));
	String goUrl = "pay/" + pt + ".jsp";

	//String goUrl = "payForm2.jsp";
	/*
	switch(pt) {
	case "카드결제":
		goUrl="pay/card.jsp";
		break;
	case "계좌이체":
		goUrl="pay/atm.jsp";
		break;
	case "포인트결제":
		goUrl="pay/point.jsp";
		break;
	}*/

	switch (pt) {
	case "card":
		money *= 1.1;
		break;
	case "atm":
		money *= 0.9;
		break;
	case "point":
		money *= 2;
		break;
	}

	goUrl += "?money=" + (int) money;
	response.sendRedirect(goUrl);
	%>
	<%=pt%>
</body>
</html>