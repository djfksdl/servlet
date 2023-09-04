package com.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/*") //모든 주소에 대해 다 적용이 되는거라 새로운 파일 만들때 따로 안해줘도됨.
public class CharacterEncodingFilter implements Filter { //임포트하면 마지막 4번째인 servlet.filter선택하기
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain  ) throws IOException, ServletException {
		
	// request , response 모두 인코딩 설정
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}
}
