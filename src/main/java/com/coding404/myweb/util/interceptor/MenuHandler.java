package com.coding404.myweb.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.coding404.myweb.product.service.ProductMapper;

public class MenuHandler implements HandlerInterceptor{
	
	@Autowired
	private ProductMapper productMapper;

	//메뉴핸들러
	@Override //포스트핸들러
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		String uri = request.getRequestURI();
		request.setAttribute("uri", uri);
		
	}

	
	
}