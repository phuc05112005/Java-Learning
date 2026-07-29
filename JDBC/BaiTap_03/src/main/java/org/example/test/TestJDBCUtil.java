package org.example.test;

import org.example.database.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJDBCUtil {
    public static void main(String[] args){
        Connection connection = JDBCUtil.getConnection();
        System.out.println(connection);

        JDBCUtil.closeConnection(connection);
        System.out.println(connection);
    }
}
