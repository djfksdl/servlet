<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
	<%
		String nickname = request.getParameter("nickname");
		String hobby = request.getParameter("hobby");
		String animal = request.getParameter("animal"); // 강아지 또는 고양이
		String fruit = request.getParameter("fruit");
		String[] foodArr = request.getParameterValues("food"); //선택 항목 값 , 배열은 무조건 돌아야함
	%>
	<table border="1">
		<tr>
			<th>별명</th>
			<td><%= nickname %></td>
		</tr>
		<tr>
			<th>취미</th>
			<td><%= hobby %></td>
		</tr>
		<tr>
			<th>선호하는 동물</th>
			<td><%= animal %></td>
		</tr>
		<tr>
			<th>선호하는 과일</th>
			<td><%= fruit %></td>
		</tr>
		<tr>
			<th>선호하는 음식</th>
			<td>
				<%
				if(foodArr != null){
					String result = "";
					for (String food : foodArr){
						result += food + ",";
					}
					//맨 뒤에 붙은 , 제거
					// abc 0,2
					// 0, result 길이 - 1 => substring
					result = result.substring(0,result.length()-1);
					out.print(result);
				}
				%>
			</td>
		</tr>
	</table>
</body>
</html>