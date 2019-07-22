<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head><script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script></head>
<script type="text/javascript">
	
	$(function(){
		$("#btn").click(function(){
			var d = $("#f").serialize();
			$.ajax({
				url: "comment.do",
				data: d,
				success: function(result){
					alert("ajax 통신 완료!");
					alert(result);
					$("#cmt").append(result);
					
				}	//Success End
			})	//Ajax End
		})	//button End
	})	//JQuery End
		
</script>
</head>
<body>
	아이디 : ${dto.id }<br>
	제목 : ${dto.title }<br>
	내용 : ${dto.content }<br>
	글쓴이 : ${dto.writer }<br>
<hr>
<a href="selectAllBbs.do">목록</a>
<form action="comment.do" id="f">
내용 : <input type="text" name="cmt_content"> 작성자 : <input type="text" name="cmt_writer">
<input type="hidden" value="${dto.id }" name="id">
<input type="button" value="전송" id="btn">
</form>
<c:forEach var="cdto" items="${list}">
	<img src="resources/3.png">${cdto.cmt_content } <font color="green">${cdto.cmt_writer}</font><br>
</c:forEach>
<li type="none" id="cmt"></li>
</body>
</html>