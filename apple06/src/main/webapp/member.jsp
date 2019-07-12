<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.itbank.mvc05.DBConnectionMgr"%>
<%@page import="sun.security.pkcs11.Secmod.DbMode"%>
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
	DBConnectionMgr mgr = DBConnectionMgr.getInstance();
	Connection con = mgr.getConnection();
	String sql = "insert into member values('wow','wow','wow','wow')";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.executeUpdate();
	out.print("오라클 성공");
	%>
</body>
</html>