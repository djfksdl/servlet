<%@page import="java.sql.ResultSet"%>
<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저목록</title>
</head>
<body>
<% 
	//DB 연결
	MysqlService ms = MysqlService.getInstance //컨트롤 스페이스바
	ms.connect();
	//DB select
	String selectQuery = "select * from `new_user`";
	ResultSet res = ms.select(selectQuery);
	// 
%>
	<h1>유저목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>생년월일</th>
				<th>이메일</th>
				<th>자기소개</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		<%
			while(res.next()){
		%>
			<tr>
				<td><%= res.getInt("id") %></td>
				<td><%= res.getInt("name") %></td>
				<td><%= res.getInt("yyyymmdd") %></td>
				<td><%= res.getInt("email") %></td>
				<td><%= res.getInt("introduce") %></td>
				<td><a href="/lesson04/delete-user?id=<%= res.getInt("id") %>">삭제</a></td>
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