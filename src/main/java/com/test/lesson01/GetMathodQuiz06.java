package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMathodQuiz06 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		//한글깨짐 방지 + json
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		//Request Parameter 
		int number1 = Integer.parseInt(request.getParameter("number1")); //1500
		int number2 = Integer.parseInt(request.getParameter("number2")); //70
		
		//사칙연산
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		double division = number1 / number2;
		
//		{
//		    "addtion": 1570,
//		    "subtraction": 1430,
//		    "multiplication": 105000,
//		    "division": 21
//		}
		//JSON으로 결과
		PrintWriter out = response.getWriter();
		out.print("{\"addtion\":"+ addition 
				+",\"subtraction\":"+ subtraction 
				+",\"multiplication\":"+ multiplication
				+",\"division\":"+ division+"}");
		
		
	}
}
