<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="hello2">hello2 서블릿 요청</a><br>
	<form action="hello2" method="post">
		<input type="submit" value="서버로 전송">
	</form>
	<hr>
	<a href="spring2">spring 서블릿 요청</a><br>
	<form action="spring2" method="post">
		<input type="submit" value="spring 전송">
	</form>
</body>
</html>