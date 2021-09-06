<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 수정 및 삭제</h1>
	<hr>
	<form action="updateTelinfo.do" method="post">
	<table border= "2">
	<tr><td>사번</td>
		<td><input type="text" name="id" value="${sawonVO.id }"></td></tr>
	<tr><td>이름</td><td>${sawonVO.name }</td></tr>
	<tr><td>전화번호</td>
		<td><input type="text" name="tel" value= "${sawonVO.tel }"></td></tr>
	<input type="hidden" name="name" value="${sawonVO.name }">
	<tr><td colspan="2"><input type = "submit" value="가자 수정"></td></tr>
 	</table>
</body>
</html>