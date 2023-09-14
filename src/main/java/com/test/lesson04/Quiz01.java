package com.test.lesson04;

import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class Quiz01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response ) {
		//응답값 plain
		response.setContentType("text.plain");
		
		//DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//DB insert
		String insertQuery
		;
		//DB select &출력
		PrintWriter out = response.getWriter();
		String selectQuery = ""; 
		try {
			ResultSet res = ms.select(selectQuery);
			while(res.next()) {
				String address = res.getString("address");
				int area = res.getInt("area");
				String type = res.getString("type");
				out.println("매물 주소:" + address + ", 면적:" + area + ", 타입:" + type );
			}
		} catch (SQLException)
				
		
		//DB연결 해제
		ms.disconnect();
	}
}
