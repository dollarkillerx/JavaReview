package com.dollarkiller.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
	private String username;
	private String password;
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO 自动生成的方法存根
		String name = arg0.getName();// 返回绑定和取消绑定对象名称
		System.out.println(name);
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO 自动生成的方法存根

	}
}
