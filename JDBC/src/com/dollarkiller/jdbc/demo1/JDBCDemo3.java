package com.dollarkiller.jdbc.demo1;

import com.dollarkiller.jdbc.utils.JDBCUitls;
import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午3:14
 * Description: No Description
 */
public class JDBCDemo3 {
    public static void saveData() {
        Connection connection = null;
        Statement statement = null;
        try{
            JDBCUitls.registerJDBCDrive();
            connection = JDBCUitls.getConnection();

            statement = connection.createStatement();
            String sql = "insert into user value(null,'ccc','1asdasd','万事达')";
            int i = statement.executeUpdate(sql);
            if (i>0){
                System.out.println("save Ok");
            }else{
                System.out.println("save no");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JDBCUitls.release(statement,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        saveData();
    }
}
