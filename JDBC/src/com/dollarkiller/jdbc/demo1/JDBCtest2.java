package com.dollarkiller.jdbc.demo1;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午2:25
 * Description: No Description
 */
public class JDBCtest2 {
    public static void saveData() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
            statement = connection.createStatement();
            String sql = "INSERT INTO goods(name,price,desp) VALUE('耳机',200.0,'蓝牙耳机')";
            int i = statement.executeUpdate(sql);
            if(i>0) {
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        saveData();
    }
}
