<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>      <!--  나는 sawonAll.jsp  -->
<body>  
	<h1>사원 전체 명단</h1>
	<table border="2">
	<thead>	<tr><th>번호</th>	<th>이름</th>	<th>전화</th>	</tr>
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
