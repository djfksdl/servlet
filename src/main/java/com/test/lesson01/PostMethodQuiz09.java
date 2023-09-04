package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException {
		// html
		response.setContentType("text/html");
		
		// Request Parms
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		// 내용 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body>");
		out.print("<b>" + name + "</b>님 지원이 완료 되었습니다.");
		out.print("<h3>지원 내용</h3>");
		out.print(introduce);
		out.print("</body></html>");
	}
}
