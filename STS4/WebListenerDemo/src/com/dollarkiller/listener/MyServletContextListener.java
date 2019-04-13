package com.dollarkiller.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO 自动生成的方法存根
		String appName = sce.getServletContext().getInitParameter("app_name");
		String version = sce.getServletContext().getInitParameter("version");
		sce.getServletContext().setAttribute("appName", appName);
		sce.getServletContext().setAttribute("version", version);
		System.out.println("appName: "+appName + " version: " + version);
	}

}
