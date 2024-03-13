import java.sql.*;
import java.util.Properties;

public class DBConnection {
    static Connection con = null;

    // load the driver
    public static Class loadDriver() throws Exception {
        return Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    // get the connection
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
    }
}
