package com.dollarkiller.jdbc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午3:04
 * Description: JDBC 工具类
 */
public class JDBCUitls {
    private static final String driverClass;
    private static final String url;
    private static final String username;
    private static final String password;
    static {
        // 加载属性文件并解析:
        Properties properties = new Properties();
        // 类加载器获取
        InputStream inStream = JDBCUitls.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(inStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driverClass = properties.getProperty("driverClass");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    /**
     * 注册驱动
     * @throws ClassNotFoundException
     */
    public static void registerJDBCDrive() throws ClassNotFoundException {
        Class.forName(driverClass);
    }

    /**
     * 获得链接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }


    public static void release(Statement statement,Connection connection) throws SQLException {
        if (statement != null) {
            statement.close();
            statement = null;
        }
        if (connection != null){
            connection.close();
            connection = null;
        }
    }

    public static void release(ResultSet resultSet,Statement statement,Connection connection) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
            resultSet = null;
        }
        if (statement != null) {
            statement.close();
            statement = null;
        }
        if (connection != null){
            connection.close();
            connection = null;
        }
    }

    public static void release(ResultSet resultSet,PreparedStatement preparedStatement,Connection connection) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
            resultSet = null;
        }
        if (preparedStatement != null) {
            preparedStatement.close();
            preparedStatement = null;
        }
        if (connection != null){
            connection.close();
            connection = null;
        }
    }


}
