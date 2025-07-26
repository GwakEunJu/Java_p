<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이력서</title>
</head>
<body>
	<h1>이력서</h1>
	<form action="/jspPrj/PageReg" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="text" name="birth" /></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="addr" /></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><input type="file" name="upfile" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="전송" /></td>
		</tr>
		</table>
	</form>
</body>
</html>