package com.dollarkiller.jdbc.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

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
public class JDBCUitlsC3p0 {
    private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();

    /**
     * 获得链接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
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
