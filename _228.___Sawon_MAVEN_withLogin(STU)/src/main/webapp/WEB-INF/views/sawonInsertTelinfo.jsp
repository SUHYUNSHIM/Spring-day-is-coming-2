<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
<h1>사원정보 입력</h1>
<form action="insertTelinfo.do">
	<table border="2">
		<tr>
			<td>사번</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" name="tel"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="추가"></td>
		</tr>
	</table>
</form>
<table border=0>
	<tr>
		<td><a href="getAllTelinfo.do">[모두보기]</a></td>
	</tr>
</table>
</body>
</html>