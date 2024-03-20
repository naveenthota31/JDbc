import java.sql.*;
import java.util.*;

/**
 * JdbcDataInsertion
 */
public class JdbcDataInsertion {
    public static void main(String[] args) throws Exception {
        // load driver
        DBConnection.loadDriver();
        System.out.println("Driver loaded...");

        // get Connection
        Connection con = DBConnection.getConnection();
        System.out.println("Connection Established...");

        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of records to be inserted: ");
        int noOfRecords = sc.nextInt();

        // create statement
        Statement st = con.createStatement();

        // take input from user
        for (int i = 0; i < noOfRecords; i++) {
            System.out.println("Roll Number " + (i + 1) + ": ");
            int rno = sc.nextInt();
            System.out.println("Name " + (i + 1) + ": ");
            String name = sc.next();
            System.out.println("Email " + (i + 1) + ": ");
            String email = sc.next();

            // create a query
            String query = "INSERT INTO students_01 VALUES(" + rno + ",'" + name + "','" + email + "')";
            st.executeUpdate(query);

            System.out.println("Successfully inserted the record of: " + rno);
            System.out.println();
        }

        // close Connections
        sc.close();
        st.close();
        con.close();
    }
}
