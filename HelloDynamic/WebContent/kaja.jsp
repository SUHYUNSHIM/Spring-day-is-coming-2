<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="sawon1" class="sawonpkg.Sawon"/> <!--Sawon sawon1 = new Sawon();  -->  
<jsp:setProperty name="sawon1" property="*"/>     <!--setter로 싹 가져온다.  -->
<!--sawon1.setIrum("넘어오는 이름") sawon1.setNa2("넘어오는 나이")  -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>출력</h2>
이름은 <jsp:getProperty name="sawon1" property="irum"/> <%--이름은 <%=irum %> 나이는 <%=na2%> <br>--%> <!--sawon1.getIrum();  -->
나이는 <jsp:getProperty name="sawon1" property="na2"/> <%--출력 이름은 ${param.irum}이고 나이는 ${param.na2}--%>

</body>
</html>