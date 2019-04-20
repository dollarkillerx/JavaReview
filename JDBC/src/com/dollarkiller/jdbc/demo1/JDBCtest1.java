package com.dollarkiller.jdbc.demo1;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午1:55
 * Description: No Description
 */
public class JDBCtest1 {
    public static void getInfo() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
            String sql = "SELECT * FROM `goods`";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                String desp = resultSet.getString("desp");
                System.out.println("id: "+id+" name: "+name+" price: "+price+" desp: "+desp);
            }

        } catch (SQLException e){
            e.printStackTrace();

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (resultSet != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                resultSet = null;
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                statement = null;
            }
            if (connection!=null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                connection = null;
            }

        }
    }

    public static void main(String[] args) {
        getInfo();
    }
}
