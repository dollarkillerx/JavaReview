package com.dollarkiller.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.dollarkiller.cache.LoginCache;

public class LgoinSessionListener implements HttpSessionAttributeListener {
	private static final String LOGIN_USER="loginUser";
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO 自动生成的方法存根
		String attrName = arg0.getName();
		if(LOGIN_USER.equals(attrName)) {
			String attrVal = (String)arg0.getValue();
			HttpSession session = arg0.getSession();
			String sessionId = session.getId();
			String sessionId2 = LoginCache.getInstance().getSessionIdByUsername(attrVal);
			if(sessionId2==null) {
				
			}else {
				HttpSession session2 = LoginCache.getInstance().getSessionBySessionId(sessionId2);
				session2.invalidate();
			}
			LoginCache.getInstance().setSessionIdByUserName(attrVal, sessionId);
			LoginCache.getInstance().setSessionBySessionId(sessionId, session);
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO 自动生成的方法存根

	}

}
