package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
    private static final String url = "đường dẫn đến cơ sở dữ liệu";
    private static final String user = "tên";
    private static final String password = "mật khẩu";

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
