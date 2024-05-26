package com.mycompany.app0526origin.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdalameda", "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("DB接続エラー");
            System.exit(1);
        }
    }

    public static Connection getConnection() {
        return connection;
    }    
}
