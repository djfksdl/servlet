package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/add-bookmark")
public class AddBookmarkServlet extends HttpServlet {
	public void doPost(HttpServletRequest request , HttpServletResponse response ) throws IOException{
		// 302 응답 - 컨텐트 타입 생략
		
		// Request Params
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// insert 쿼리 -> 수행
		String insertQuery = "insert into `bookmark`"
				+ "(`name`,`url`)"
				+ "values"
				+ "('" + name + "','" + url + "')";
		try {//위로 올려버리면 한꺼번에 양식 생김
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// DB연결 해제
		ms.disconnect();
		
		// 302 redirect => 즐겨찾기 목록 페이지로 이동
		response.sendRedirect("/lesson04/quiz01/bookmarkList.jsp"); //위로 던지기
	}
}
