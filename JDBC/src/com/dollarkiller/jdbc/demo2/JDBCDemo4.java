package com.dollarkiller.jdbc.demo2;

import com.dollarkiller.jdbc.utils.JDBCUitls;

import java.sql.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午3:40
 * Description: 演示SQL注入漏洞
 */
public class JDBCDemo4 {
    /**
     * 会产生sql注入漏洞的方法
     * @param username
     * @param password
     * @return
     */
    public static boolean login(String username,String password) {
        boolean status = false;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            JDBCUitls.registerJDBCDrive();
            connection = JDBCUitls.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                status = true;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JDBCUitls.release(resultSet,statement,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return status;
    }

    /**
     * 避免sql注入漏洞的方法
     * @param username
     * @param password
     * @return
     */
    public static boolean loginEx(String username,String password) {
        boolean status = false;
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        try {
            JDBCUitls.registerJDBCDrive();
            connection = JDBCUitls.getConnection();
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            // 预处理
            preparedStatement = connection.prepareStatement(sql);
            // 设置参数
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                status = true;
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

        return status;
    }

    public static void main(String[] args) {
//        if (login("aaa' or '1=1","111 OR id!=0")){
//            System.out.println("login ok");
//        }else{
//            System.out.println("login out");
//        }

//        if (login("aaa' -- ","111 OR id!=0")){
//            System.out.println("login ok");
//        }else{
//            System.out.println("login out");
//        }

        if (loginEx("aaa","111")){
            System.out.println("login ok");
        }else{
            System.out.println("login out");
        }
    }
}
