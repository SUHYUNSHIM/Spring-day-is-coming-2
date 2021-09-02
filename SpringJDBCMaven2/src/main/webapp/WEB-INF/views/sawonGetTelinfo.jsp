<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>한명 출력</h1>
	<form action="updateTelinfo.do" method="post">
		<table border="1">
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>전화번호</th>
			</tr>
			<tr>
				<td><input type="text" name="id" value="${mTelinfo.id}" /></td>
				<!-- readonly로 해서 수정을 못하게하고 값을 넘겨도 됨 -->
				<td><input type="text" name="name" value="${mTelinfo.name}" readonly/></td>
				<td><input type="text" name="tel" value="${mTelinfo.tel}" /></td>
			</tr>
			<tr>
				<td colspan="3">
					<input type="submit" value="수정" /> 
					<input type="reset" value="취소" />
				</td>
			</tr>	
		</table>		
		<!-- hidden으로 값을 넘기거나 -->
		<%-- <input type="hidden" name="name" value="${mTelinfo.name}" /> --%>
	</form>
	
	<a href="getAllTelinfo.do">[모두보기]</a>
	<a href="deleteTelinfo.do?name=${mTelinfo.name}">[삭제]</a>
</body>
</html>