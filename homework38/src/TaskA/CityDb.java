package TaskA;

import java.sql.*;
import java.util.List;

public class CityDb {

    public static void addToList(List<City> list) {

        for (City city : list)
            if (check(city.getId())) update(city.getId(), city);

            else insert(city);
    }

    public static boolean check(int id) {
        String sql = "SELECT * FROM city2";

        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);) {
             while (rs.next()) {
                 if (rs.getInt("city_id") == id) return true;
             }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static void insert(City city) {
        String sql = "insert into city2(city_id, city_name) values(?, ?)";

        try (Connection conn = new DbConnection().connect();
             PreparedStatement ps = conn.prepareStatement(sql);) {

             ps.setInt(1, city.getId());
             ps.setString(2, city.getName());
             ps.executeUpdate();

        }

        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void update(int id, City city){
        String sql = "UPDATE city2 SET city_name = ? WHERE city_id = ?";
        try (Connection conn = new DbConnection().connect();
             PreparedStatement ps = conn.prepareStatement(sql);){

             ps.setString(1, city.getName());
             ps.setInt(2, id);
             ps.executeUpdate();
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
