package TaskB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDb {

    public static void insertCountry(int countryId, String countryName, String code, int countryPopulation, int presidentId) {
        String sql = "insert into country(country_id, country_name, code, country_population, president_id)" +
                " values(?, ?, ?, ?, ?)";

        try (Connection conn = new DbConnection().connect();
             PreparedStatement ps = conn.prepareStatement(sql);){
             ps.setInt(1, countryId);
             ps.setString(2, countryName);
             ps.setString(3, code);
             ps.setInt(4, countryPopulation);
             ps.setInt(5, presidentId);
             ps.executeUpdate();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Country> addToList() {
        String sql = "SELECT * FROM country JOIN person ON person.person_id = country.president_id;";
        List<Country> countries = new ArrayList<>();
        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);){

            while (rs.next()) {
                Person person = new Person(rs.getInt("person_id"), rs.getString("person_name"), rs.getString("birth_date"));
                Country country = new Country(rs.getInt("country_id"), rs.getString("country_name"),
                        rs.getString("code"), rs.getInt("country_population"), person);

                countries.add(country);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return countries;
    }
}
