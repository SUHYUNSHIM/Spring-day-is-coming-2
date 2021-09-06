<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>     
<meta charset="euc-kr">
<title>Insert title here</title>
</head>                          <!-- 이 파일명은 sawonGetTelinfo.jsp -->
<
<body>
	<h1>사원 수정 및 삭제</h1> 
	<hr>
	<form action="updateTelinfo.do" method="post"> <!-- 수정하려 -->
	<table border="2">
	 <tr><td>사번</td>
	     <td><input type="text" name="id" value="${sawonVO.id}"></td></tr>
              <!-- input value방식은 입출력 다 된다는   ${sawonVO.getId()}-->
 	<tr><td>이름</td><td>${sawonVO.name} </td></tr> 
          <!--  이건 출력만 된다는  -->
	<tr><td>전화번호</td>
        <td><input type="text" name="tel" value="${sawonVO.tel}"></td></tr>

	<input type="hidden" name="name" value="${sawonVO.name}">
<tr><td colspan="2"><input type="submit" value="가자 수정"></td></tr> 
</table>
   </form>
  
<table border=0>
<tr><td><a href="sawonAll.do">[모두보기]</a></td>
 <td><a href="deleteTelinfo.do?name=${sawonVO.name}">[삭제]</a>
</table>         <!-- 삭제하러 -->
	
</body>
</html>


