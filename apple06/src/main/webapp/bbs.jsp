<%@page import="com.itbank.mvc05.BbsDTO"%>
<%@page import="com.itbank.mvc05.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	BbsDAO dao = new BbsDAO();
	BbsDTO dto = new BbsDTO();
	dto.setId("300");
	dto.setTitle("oracle");
	dto.setContent("hate oracle");
	dto.setWriter("jung");
	dao.insert(dto);
	out.print("삽입완료");
	%>
</body>
</html>