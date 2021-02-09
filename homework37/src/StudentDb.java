import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDb {

    public void studentDb() {
        countStudents();
    }

    private void countStudents() {
        String sql = "SELECT COUNT(students.id) FROM students";
        int count = 0;

        try(Connection conn = new DbConnection().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);){
            rs.next();
            count = rs.getInt("COUNT");
            System.out.println("В группе " + count + " студентов");
        }

        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
