package com.dollarkiller.jdbc.c3p0;

import com.dollarkiller.jdbc.utils.JDBCUitls;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午4:33
 * Description: 连接池测试类
 */
public class DataSourceDemo {
    /**
     * 手动配置连接池
     */
    public void demo1() {
        // 获得链接:
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            // 创建一个连接池:
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            // 设置连接池参数
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            // 设置连接池参数
            dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/javaJDBC");
            dataSource.setUser("javaJDBC");
            dataSource.setPassword("7jz7bSj6Jkj8jxxj");

            // 获得链接:
            connection = dataSource.getConnection();
            // 编写sql
            String sql = "SELECT * FROM user";
            // 预编译sql
            preparedStatement = connection.prepareStatement(sql);
            resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JDBCUitls.release(resultSet,preparedStatement,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用配置文件方式
     */
    public static void demo2() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            // 获得链接:
            connection = dataSource.getConnection();
            // 编写sql
            String sql = "SELECT * FROM user";
            // 预编译sql
            preparedStatement = connection.prepareStatement(sql);
            resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JDBCUitls.release(resultSet,preparedStatement,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        (new DataSourceDemo()).demo1();
        demo2();
    }

}
