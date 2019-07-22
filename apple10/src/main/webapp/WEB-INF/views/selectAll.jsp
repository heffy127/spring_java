<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색 리스트</h1>
	<c:forEach var="dto" items="${list}">
		아이디 : ${dto.id}<br>
		비밀번호 : ${dto.pw}<br>
		이름 : ${dto.name}<br>
		전화번호 : ${dto.tel}<br>
		<hr>
	</c:forEach>
</body>
</html>