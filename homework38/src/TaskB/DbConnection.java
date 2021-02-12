package TaskB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private final String url = "jdbc:postgresql://localhost:5432/homework38a";
    private final String user = "postgres";
    private final String password = "2m3410lt";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
