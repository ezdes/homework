import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDb {

    public static List<Car> getCar() {
        String sql = "SELECT * FROM car";

        List<Car> cars = new ArrayList<>();
        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet set = stmt.executeQuery(sql)){

             while (set.next()) {
                 cars.add(new Car(set.getInt("id"), set.getInt("manufacture_year"), set.getString("model"),
                         set.getInt("price"), set.getString("color")));
             }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cars;
    }
}
