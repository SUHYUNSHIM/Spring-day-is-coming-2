<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="sawon1" class="sawonpkg.Sawon"/>
<jsp:setProperty name="sawon1" property="*"/>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>출력</h2>
이름은 <jsp:getProperty name="sawon1" property="irum"/>
나이는 <jsp:getProperty name="sawon1" property="na2"/>

</body>
</html>