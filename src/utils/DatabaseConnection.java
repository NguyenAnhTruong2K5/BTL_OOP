package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url = "";
    private static final String user = "root";
    private static final String password = "";

    public static Connection setConnect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch(SQLException e) {
            System.out.println("Error connect");
        }

        return conn;
    }
}
