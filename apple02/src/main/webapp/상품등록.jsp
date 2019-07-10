<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 등록</h1>
	<form action="confirm">
		상품id : <input type="text" name="id"><br>
		상품명 : <input type="text" name="name"><br>
		가격 : <input type="text" name="price"><br>
		마일리지 : <input type="text" name="mileage"><br>
		<button type="submit">전송</button>
	</form>
	<hr>
	<a href="상품등록.jsp"><button>상품등록</button></a>
	<a href="상품삭제.jsp"><button>상품삭제</button></a>
	<a href="상품상세검색.jsp"><button>상품상세검색</button></a>
</body>
</html>