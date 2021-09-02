<%@ page language="java" contentType="text/html; charset=euc-kr"  pageEncoding="euc-kr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>Insert title here</title>
</head>  
 <!-- 나는  sawonInsertTelinfo.jsp , 위치는 index.jsp랑 같은 위치 -->
<body>

  <h1>사원정보 입력</h1>
  
  <form action="insertTelinfo.do" method="post">
  <table border="2">
	<tr><td>사번</td> <td><input type="text" name="id"></td></tr>
	<tr><td>이름</td> 	<td><input type="text" name="name"></td></tr>
   <tr><td>전화번호</td>	<td><input type="text" name="tel"></td></tr>
   <tr><td colspan="2"><input type="submit" value="추가"></td></tr>
  </table>
  
  <table border=0>
	<tr><td><a href="getAllTelinfo.do">[모두보기]</a></td>
  </table>
</form>
</body>
</html>



