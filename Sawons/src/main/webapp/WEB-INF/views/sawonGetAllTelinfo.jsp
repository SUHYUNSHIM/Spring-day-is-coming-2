<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 전체 보기</h1> <hr>
	<tr><td>사번</td><td>이름</td><td>전화번호</td></tr>
	
	<!-- java의 for: 과 같은 것 -->
	<c:forEach var="alltelinfo1" items="${mAllTelinfo}">
		<tr><td>${alltelinfo1.id }</td>
			<td><a href="getTelinfo.do?name=${alltelinfo1.name }"> ${alltelinfo1.name }</a>
			<td>${alltelinfo1.tel }</td></tr>
	</c:forEach>
	<table border=0>
	<tr><td><a href="sawonInsertTelinfo.jsp">[입력]</a></td>
		<td><a href="getAllTelinfo.do">[모두보기]</a></td></tr>
	</table>
</body>
</html>