<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
	<form action="update.do">
		아이디 : <input type="text" value=${bbsDTO.id } name="id" readonly="readonly"><br>
		제목 : <input type="text" value=${bbsDTO.title } name="title"><br>
		내용 : <input type="text" value=${bbsDTO.content } name="content"><br>
		글쓴이 : <input type="text" value=${bbsDTO.writer } name="writer"><br>
		<button type="submit">수정</button>
	</form>
</body>
</html>