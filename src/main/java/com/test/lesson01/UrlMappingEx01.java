package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet {
	@Override // 오류를 빨리 잡기 위해서
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		
		//한글깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter(); // 오른쪽은 오류처리 첫번째것 하기
		out.println("안녕하세요");
		
		//날짜
		Date now = new Date();
		
		//formatter
		//2023-08-29 오후 19:43:44
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		out.println(sdf.format(now));
	}
}
