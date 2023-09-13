package com.test.lesson04;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class Quiz01 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response ) {
		//응답 plain
		respopnse.setContentType("text.plain");
		
		//DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//DB 인서트 뭐리 수행
		
		//DB 셀렉트 쿼리 수행&출력
		
		//DB연결 해제
		ms.disconnect();
	}
}
