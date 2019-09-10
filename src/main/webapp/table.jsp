<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String col = request.getParameter("c");
	String row = request.getParameter("r");
	int nCol = Integer.parseInt(col);
	int nRow = Integer.parseInt(row);
%> <!-- java코드를 넣어주기 위한 스크립트릿 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=nCol %>, <%=nRow %> <!-- 스크립트릿 표현식 -->
	<a href='/helloweb'>HOME으로 가기</a>
	<br/>
	<br/>
	<!-- <table style='border:1px solid #000000'> --> <!-- outline -->
	<table border='1px' cellspacing='0px' cellpadding='2px'>
		<%
			for(int i = 0; i< nRow; i++) {
		%>
		<tr>
			<%
				for(int j = 0; j < nCol; j++) {
			%>
				<td>cell(<%=i %>,<%=j %>)</td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>