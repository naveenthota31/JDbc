import java.sql.*;

public class JdbcTableCreation {
    public static void main(String[] args) throws Exception {
        // load driver
        DBConnection.loadDriver();
        System.out.println("Driver  Loaded...");

        // get connection from DBConnection
        Connection con = DBConnection.getConnection();
        System.out.println("Connection  Established....");

        // Create a statement
        Statement statm = con.createStatement();

        // query
        String query = "CREATE TABLE students_01(rollno int, name char(10), email char(100))";

        int n = statm.executeUpdate(query);
        System.out.println("Value of n is : " + n);

        if (n >= 0) {
            System.out.println("Students table created successfully !!");
        } else {
            System.out.println("Table creation SuckS !!");
        }

        // close connections
        statm.close();
        con.close();
    }
}
