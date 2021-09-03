<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%if(session.getAttribute("loginVO")==null) {%>
	<script>
		alert("로그인 해주세요!");
		location.href="start.do";
	</script>	
<%}%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 여기서는 한명에 대한 정보를 출력 -->
<h1>사원 한명 보기</h1>
<hr>
<form action="updateTelinfo.do" method="post">
	<table border="2">
		<tr>
			<td>사번</td>
			<td><input type="text" name="id" value="${mTelinfo.id}" readonly="readonly"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${mTelinfo.name}"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" name="tel" value="${mTelinfo.tel}"></td>
			<td colspan="2"><input type="submit" value="가자 수정"></td>
		</tr>
	</table>
</form>
<table border=0>
	<tr>
		<td><a href="getAllTelinfo.do">[모두보기]</a></td>
		<td><a href="deleteTelinfo.do?id=${mTelinfo.id}">[삭제]</a></td>
	</tr>
</table>
</body>
</html>