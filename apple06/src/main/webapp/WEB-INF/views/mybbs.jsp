<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<table border="1">
		<tr>
			<td>
				아이디
			</td>
			<td>
				${bbsDTO.id }
			</td>
		</tr>
		<tr>
			<td>
				제목
			</td>
			<td>
				${bbsDTO.title }
			</td>
		</tr>
		<tr>
			<td>
				내용
			</td>
			<td>
				${bbsDTO.content }
			</td>
		</tr>
		<tr>
			<td>
				작성자
			</td>
			<td>
				${bbsDTO.writer }
			</td>
		</tr>
	</table>
</body>
</html>