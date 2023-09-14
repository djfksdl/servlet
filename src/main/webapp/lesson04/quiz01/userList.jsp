<%@page import="java.sql.ResultSet"%>
<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	//DB 연결
	MysqlService ms = MysqlService.getInstance //컨트롤 스페이스바
	ms.connect();
	//DB select
	String selectQuery = "select * from `bookmark`";
	ResultSet res = ms.select(selectQuery);
	// 
%>
	<h1>유저목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>사이트</th>
				<th>사이트 주소</th>
			</tr>
		</thead>
		<tbody>
		<%
			while(res.next()){
		%>
			<tr>
				<td><%= res.getInt("name") %></td>
				<td><%= res.getInt("address") %></td>
			</tr>
			<%
				} 
			%>
		</tbody>
	</table>
	<%
	// DB 연결 해제
	ms.disconnect();
	%>
	
</body>
</html>