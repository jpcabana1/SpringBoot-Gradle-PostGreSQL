import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

    public static void main(String args[]) throws SQLException {
        Connection c = getConnection();
        System.out.print(c);

    }

    public static Connection getConnection()throws SQLException{
        String USERNAME = "prudentialdb";
        String PASSWORD = "admin";
        String CONN = "jdbc:postgresql://localhost:5432/prudentialdb";

        try {
            Class.forName("org.postgresql.Driver");
           return DriverManager
                    .getConnection(CONN,USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return null;
    }
}
