<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html> <!-- 나는 SawonInsertForm.jsp -->
<head>   
 
<meta  charset="euc-kr"/>   
<title>사원등록</title>
</head>
<body>
	<h1>사원 등록</h1>
	<form action="sawonInsert.do" method="post">
  <table border="2">
	<tr><td>사번</td>
			<td><input type="text" name="id"></td></tr>
	<tr><td>이름</td>
	  		<td><input type="text" name="name"></td></tr>
   <tr><td>전화번호</td>
			<td><input type="text" name="tel"></td></tr>
   <tr><td colspan="2"><input type="submit" value="추가"></td></tr>
  </table>
</body>
</html>

  



	