<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.DBConnectionMgr"%>
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
	DBConnectionMgr mgr = DBConnectionMgr.getInstance(); // 만들어져있으면 그냥 넘겨주고 아니면 생성 후 넘김
	Connection con = mgr.getConnection();
	out.print("오라클 DB연동 성공");
	String sql = "insert into member values('win','win','win','win')";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.executeUpdate();
	out.print("오라클 SQL 전송 성공..");
	%>
</body>
</html>