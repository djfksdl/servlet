package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07")
public class GetMethodQuiz07 extends HttpServlet{
	@Override
	public void doGet (HttpServletRequest request , HttpServletResponse response) throws IOException {
		//한글 깨짐 방지 -> html
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		//Request parameter
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int price = Integer.valueOf(request.getParameter("price")) ;
		
		//출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body>");
		
		if (address.contains("서울시") == false) { //또는 !address.contains("서울시") 라고 해도됨
			out.print("배달 불가 지역입니다.");
		} else if(card.equals("신한카드")) {
			out.print("결제 불가 카드입니다.");
		} else {
			out.print(address + " <b>배달준비중</b><br>");
			out.print("결제 금액: " + price);
		}	
		out.print("</body></html>");
		
	}
}
