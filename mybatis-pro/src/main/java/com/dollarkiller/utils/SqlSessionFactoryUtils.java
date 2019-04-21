package com.dollarkiller.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午8:03
 * Description: No Description
 */
public class SqlSessionFactoryUtils {
    private static String RESOURCE = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    /**
     * 创建一个初始化SqlSessionFactory的方法
     */
    public static void initSqlSessionFactry() {
        try {
            InputStream is = Resources.getResourceAsStream(RESOURCE);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            System.out.println(e.getMessage()+ "this is initSqlSessionFactry");
        }
    }

    /**
     * 获取工厂对象的方法
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    /**
     * 关闭SqlSession的方法
     */
    public static void close() {
        SqlSession session = threadLocal.get();
        if (session != null) {
            session.close();
            threadLocal.set(null);
        }
    }
}
