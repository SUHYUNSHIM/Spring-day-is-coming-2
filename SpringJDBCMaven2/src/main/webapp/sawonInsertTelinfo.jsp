<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 정보 입력</h1>

	<form action="insertTelinfo.do" method="psot">
		<table border="1">
			<tr>
				<td>사번</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="추가"/></td>
			</tr>
		</table>
	</form>
	
	<a href="getAllTelinfo.do">[모두보기]</a>	
</body>
</html>