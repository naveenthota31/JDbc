import java.sql.*;
import java.util.Properties;

public class DBConnection {
    static Connection con = null;

    public static Class loadDriver() throws Exception {
        return Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";

        Properties props = new Properties();
        props.setProperty("user", "system");
        props.setProperty("password", "tiger");

        // You can also set other properties like SSL, connection timeout etc.

        return DriverManager.getConnection(url, props);
    }
}