<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 전체 보기</h1>
	<table border="1">
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>전화번호</td>
		</tr>
		<c:forEach var="alltelinfo1" items="${mAllTelinfo}">
			<tr>
				<td>${alltelinfo1.id}</td>
				<!-- form태그나 a태그 등 value값을 가지고 컨트롤러로 넘어가게 되면
					그것을 받는 vo에서 자동으로 그 값이 setter됨
					따라서 지금같이 name=value의 형태는 setName(value)이런느낌 -->
				<td><a href="getTelinfo.do?name=${alltelinfo1.name}">${alltelinfo1.name}</a></td>
				<td>${alltelinfo1.tel}</td>
			</tr>
		</c:forEach>
	</table>
	
	<table border="0">
		<tr>
			<td><a href="sawonInsertTelinfo.jsp">[입력]</a></td>
			<td><a href="getAllTelinfo.do">[모두보기]</a></td>
		</tr>
	</table>
</body>
</html>