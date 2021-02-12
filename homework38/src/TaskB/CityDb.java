package TaskB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDb {

    public static void insertCity(int cityId, String cityName, int countryId, int mayorId, int cityPopulation) {
        String sql = "INSERT INTO city(city_id, city_name, country_id, mayor_id, city_population) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = new DbConnection().connect();
             PreparedStatement ps = conn.prepareStatement(sql);){
             ps.setInt(1, cityId);
             ps.setString(2, cityName);
             ps.setInt(3, countryId);
             ps.setInt(4, mayorId);
             ps.setInt(5, cityPopulation);
             ps.executeUpdate();
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<City> addToList() {
        String sql = "SELECT * FROM city ci" +
                " join person p on p.person_id = ci.mayor_id;";

        List<City> cities = new ArrayList<>();
        Country country = null;
        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

             while (rs.next()) {

                 for (int i = 0; i < CountryDb.addToList().size(); i++){
                     if (CountryDb.addToList().get(i).getCountryId() == rs.getInt("country_id")) {
                         country = CountryDb.addToList().get(i);
                         break;
                     }
                 }

                 Person personMayor = new Person(rs.getInt("person_id"), rs.getString("person_name"), rs.getString("birth_date"));
                 City city = new City(rs.getInt("city_id"), rs.getString("city_name"),
                       country, personMayor, rs.getInt("city_population"));

                 cities.add(city);
             }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cities;
    }
}
