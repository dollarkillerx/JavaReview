package com.dollarkiller.listener;

import java.util.Date;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO 自动生成的方法存根
		String sessionId = arg0.getSession().getId();
		Date createTIme = new Date(arg0.getSession().getCreationTime());
		System.out.println("session id: "+sessionId +"caresterTime: " + createTIme);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

}
