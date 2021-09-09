<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>성적구하기</h1>
<form action ="grade" method="get">
이름입력<input type="text" name="name"><br>
java점수입력<input type="text" name="java"><br>
ui점수 입력<input type="text" name="ui"><br>
sql점수 입력<input type="text" name="sql"><br>
<input type="submit" value="가자서버로">
</form>
</body>
</html>