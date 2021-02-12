package TaskB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDb {

    public static void insertPerson(int personId, String personName, String birthDate) {
        String sql = "insert into person(person_id, person_name, birth_date) values(?, ?, ?)";
        try (Connection conn = new DbConnection().connect();
             PreparedStatement ps = conn.prepareStatement(sql);){
             ps.setInt(1, personId);
             ps.setString(2, personName);
             ps.setString(3, birthDate);
             ps.executeUpdate();
        }

        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
