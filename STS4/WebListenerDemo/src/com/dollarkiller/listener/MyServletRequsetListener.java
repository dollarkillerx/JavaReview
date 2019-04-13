package com.dollarkiller.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class MyServletRequsetListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO 自动生成的方法存根
		HttpServletRequest requser = (HttpServletRequest)arg0.getServletRequest();
		String path = requser.getRequestURI();
		String par = requser.getParameter("par");
		System.out.println("requser listener,path: " + path + "par" + par);
	}

}
