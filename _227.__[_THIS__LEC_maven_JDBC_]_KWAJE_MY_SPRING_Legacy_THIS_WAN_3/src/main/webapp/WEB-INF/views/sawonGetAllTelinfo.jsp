<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>      <!-- ���ϸ���   sawonGetAllTelinfo.jsp --> 
<head>               
<meta charset="euc-kr">
<title>Insert title here</title>
</head>

<body>
	<h1>��� ��ü ����</h1>	<hr>
	<table border="1">
	<tr><td>���</td><td>�̸�</td><td>��ȭ��ȣ</td></tr>

		     <!-- java�� for : ������ -->
		<c:forEach var="alltelinfo1" items="${mAllTelinfo}">
		    <tr><td>${alltelinfo1.id}</td>
                 <td><a href="getTelinfo.do?name=${alltelinfo1.name}"> ${alltelinfo1.name}</a>
			    <td>${alltelinfo1.tel}</td> </tr>
		</c:forEach>
	
		<table border=0>
		
		 <tr><td><a href="sawonInsertTelinfo.jsp">[�Է�]</a></td>
			 <td><a href="getAllTelinfo.do">[��κ���]</a></td> </tr>
	    </table>
</body>
</html>






