package com.dollarkiller.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionFilter implements Filter {

	@Override
	public void destroy() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO 自动生成的方法存根
		request.setCharacterEncoding("UTF-8");
		HttpServletRequest hreq = (HttpServletRequest)request;
		HttpServletResponse hrpse = (HttpServletResponse)response;
		
		String loginUser = (String)hreq.getSession().getAttribute("username");
		if(loginUser == null)  {
			hrpse.sendRedirect(hreq.getContextPath() + "/index.jsp?flag=1");
			return;
		}else {
			chain.doFilter(request, response);
			return;
		}

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO 自动生成的方法存根

	}

}
