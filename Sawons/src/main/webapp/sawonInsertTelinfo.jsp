<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>������� �Է�</h1>
<form action="insertTelinfo.do" method="post">
  <table border="2">
	<tr><td>���</td> <td><input type="text" name="id"></td></tr>
	<tr><td>�̸�</td> 	<td><input type="text" name="name"></td></tr>
   <tr><td>��ȭ��ȣ</td>	<td><input type="text" name="tel"></td></tr>
   <tr><td colspan="2"><input type="submit" value="�߰�"></td></tr>
  </table>
  
  <table border=0>
	<tr><td><a href="getAllTelinfo.do">[��κ���]</a></td>
  </table>
</form>
</body>
</html>