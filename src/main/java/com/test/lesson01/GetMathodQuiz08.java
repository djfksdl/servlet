package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08") 
public class GetMathodQuiz08 extends HttpServlet {
	@Override
	public void doGet (HttpServletRequest request , HttpServletResponse response) throws IOException {
		//한글 깨짐 방지 -> html
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		//Request parameter - 검색어
		String keyword = request.getParameter("keyword");
		
		//리스트 정의
		List<String> list = new ArrayList<>(Arrays.asList( //임포트시 자바.util선택하기 
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		
		//리스트 순회 -> 출력
		PrintWriter out = response.getWriter();
		
		Iterator<String> iter = list.iterator(); // 순회하는 방식이 들어있음 -> 임포트시 첫번째 자바.util 
		while(iter.hasNext ()) {
			String line = iter.next();
			
			//검색
//			if(line.contains(keyword)) {
//				out.print(line + "<br>");
//			}
			
			// 보너스 풀이1
//			if(line.contains(keyword)) {
//				String[] words = line.split(keyword);
//				out.print(words[0] + "<b>" + keyword + "</b>" + words[1] + "<br>");
//			}
			
			// 보너스 풀이2
			if(line.contains(keyword)) {
				line = line.replace(keyword, "<b>" + keyword + "</b>");
				out.print(line + "<br>");
			}
			
		}
		
	}
}
