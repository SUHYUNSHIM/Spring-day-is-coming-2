<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>      <!--  ���� sawonAll.jsp  -->
<body>  
	<h1>��� ��ü ���</h1>
	<table border="2">
	<thead>	<tr><th>��ȣ</th>	<th>�̸�</th>	<th>��ȭ</th>	</tr>
	</thead>
	<tbody>
		<c:forEach var="imsi" items="${alist}">
		<tr>
			<td>${imsi.id}</td>
			<td>${imsi.name}</td>
			<td>${imsi.tel}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>
