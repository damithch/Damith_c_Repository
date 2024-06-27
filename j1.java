import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {
        // Database credentials
        String dbhost = "localhost";
        String dbuser = "root";
        String dbpass = "root";
        String dbname = "shield_plus";

        // JDBC URL
        String url = "jdbc:mysql://" + dbhost + "/" + dbname;

        // Establishing the connection
        try {
            Connection connection = DriverManager.getConnection(url, dbuser, dbpass);
            System.out.println("Connection successful.");
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }
}
