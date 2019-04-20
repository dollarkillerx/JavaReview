package com.dollarkiller.jdbc.demo2;

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
 * Time: 下午5:10
 * Description: No Description
 */
public class TestDemo {
    public static void testDemo() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
            comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
            comboPooledDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/javaJDBC");
            comboPooledDataSource.setUser("javaJDBC");
            comboPooledDataSource.setPassword("7jz7bSj6Jkj8jxxj");
            connection = comboPooledDataSource.getConnection();

            String sql = "SELECT * FROM course";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
        testDemo();
    }
}
