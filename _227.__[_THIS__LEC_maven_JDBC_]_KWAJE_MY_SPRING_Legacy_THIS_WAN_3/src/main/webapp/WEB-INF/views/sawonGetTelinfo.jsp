<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>Insert title here</title>
</head>   <!-- �� ���ϸ��� sawonGetTelinfo.jsp -->

<body>
	<h1>��� �Ѹ� ����</h1>
	<hr>
	<form action="updateTelinfo.do" method="post"> 
	<table border="2">
	 <tr><td>���</td>
         <td><input type="text" name="id" value="${mTelinfo.id}"></td></tr>
             
 	  <tr><td>�̸�</td><td>${mTelinfo.name} </td></tr> 
         
	 <tr><td>��ȭ��ȣ</td>
         <td><input type="text" name="tel" value="${mTelinfo.tel}"></td></tr>



	          <input type="hidden" name="name" value="${mTelinfo.name}">
      <tr><td colspan="2"><input type="submit" value="���� ����"></td></tr> 
</table>
   </form>
   
<table border=0>
<tr><td><a href="getAllTelinfo.do">[��κ���]</a></td>
 <td><a href="deleteTelinfo.do?name=${mTelinfo.name}">[����]</a>
</table>      
	
</body>
</html>

