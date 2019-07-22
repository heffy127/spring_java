<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="dto" items="${list}">
		아이디 : <a href="selectBbs.do?id=${dto.id}">${dto.id}</a><br>
		제목 : ${dto.title}<br>
		내용 : ${dto.content}<br>
		글쓴이 : ${dto.writer}<br>
		<hr>
	</c:forEach>
	<hr>
	<c:forEach var="cDTO" items="${list_cmt}">
		<img src="resources/3.png">${cDTO.cmt_content} : <font color="green">${cDTO.cmt_writer}</font><br>
	</c:forEach>
</body>
</html>