import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GroupDb {

    public void groupDb() {
        getGroups();
    }

    private void getGroups() {
        String sql = "SELECT * FROM groups";

        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);){

            while (rs.next())
                System.out.println(rs.getInt("id") + " " + rs.getString("code"));
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
