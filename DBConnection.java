import java.sql.*;
import java.util.Properties;

public class DBConnection {
    static Connection con = null;

    // for arch Linux

    // load the driver
    public static Class loadDriver() throws Exception {
        return Class.forName("org.mariadb.jdbc.Driver");
    }

    // get the connection
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:mariadb://localhost/college", "neha", "neha");
    }

    // for windows

    // load the driver
    public static Class W_loadDriver() throws Exception {
        return Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    // get the connection
    public static Connection W_getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
    }

}
