<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주민등록 폼</title>
<style>
input {
	width:100px;
}
</style>
</head>
<body>
	<h1>주민등록번호 입력</h1>
	<form action="juminReg.jsp">
	<label>이름<input type="text" name="pname" value="자바_king" /></label><br/>
	<label>주민번호<input type="text" name="num1" maxlength="6" /> -
	<input type="text" name="num2" maxlength="7"/></label><br/>
	<input type="submit" value="확인"/>
	</form>
</body>
</html>