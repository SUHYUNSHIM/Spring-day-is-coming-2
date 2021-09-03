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
<html><!-- 파일명은 sawonGetAllTelinfo.jsp -->
<head><!-- 여기서 요청과 응답을 다 한다는 전설이 -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원 전체 보기</h1>
<table border="1">
	<tr>
		<td colspan="4">
			<form action="getAllTelinfo.do">
				<input type="submit" value="모두보기">
			</form>
		</td>
	</tr>
	<!-- controller 갔다가 business logic 처리한 다음 다시 출발한 곳으로 온다 -->
	<tr><td>사번</td><td>이름</td><td>전화번호</td></tr>
	<c:forEach var="alltelinfo1" items="${mAllTelinfo }">
		<tr><td>${alltelinfo1.id }</td>
			<td><a href="getTelinfo.do?id=${alltelinfo1.id}">${alltelinfo1.name }</a></td>
			<td>${alltelinfo1.tel }</td></tr>
	</c:forEach>
	<table border=0>
		<tr>
			<td><a href="sawonInsertTelinfo.do">[입력]</a></td>
			<td><a href="sawonLoginView.do">[메뉴선택]</a></td>
			<td><a href="memberLogout.do">[로그아웃]</a></td>
		</tr>
	</table>
</table>
</body>
</html>