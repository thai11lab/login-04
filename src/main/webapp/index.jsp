<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>Dang nhap</div>
	<form action="/test/login" method="post">
		<label for="username">UserName</label>
		<input type="text" name="username">
		<br>
		<label for="password">password</label>
		<input type="password" name="password">
		<input type="submit" value="submit">
	</form>
</body>
</html>