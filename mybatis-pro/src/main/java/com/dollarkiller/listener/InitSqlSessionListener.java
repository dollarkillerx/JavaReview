package com.dollarkiller.listener;

import com.dollarkiller.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午8:17
 * Description: No Description
 */
@WebListener
public class InitSqlSessionListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("容器加载中....");
        // 初始化我们的SqlSessionFactory对象
        SqlSessionFactoryUtils.initSqlSessionFactry();

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("容器销毁中....");
        // 关闭SqlSession对象
        SqlSessionFactoryUtils.close();
    }
}
