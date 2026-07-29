package org.example.database;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection c = null;

        try {
            // Đăng ký MySQL Driver với DriverManager
            DriverManager .registerDriver(new Driver());
            String url = "jdbc:mysql://localhost:3306/ontap";
            String username = "root";
            String password = "";

            // Tạo kết nối
            c = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }

    public static void closeConnection(Connection c){
        try {
            if(c!=null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printInfo(Connection c){
        try {
            if(c!=null) {
                System.out.println(c.getMetaData().toString());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
