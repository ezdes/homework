
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainersDb {

    public void trainersDb() {
        getTrainers();
        getTotalSalary();
        checkTrainerFullName();
    }

    private void getTrainers() {

        String sql = "SELECT trainers.full_name, sport_type.salary FROM trainers JOIN sport_type on sport_type.id = trainers.sport_type;";
        try (Connection conn = new DbConnection().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);)
        {
            while (rs.next()) {
                System.out.println(rs.getString("full_name") + " " + rs.getInt("salary"));
            }
        }

        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    private void getTotalSalary(){
        String sql = "SELECT SUM(sport_type.salary) " +
                     "FROM trainers JOIN sport_type ON sport_type.id = trainers.sport_type;";

        int total = 0;
        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);)
        {

             rs.next();
             total = rs.getInt("SUM");
             System.out.println("Total salary: " + total);

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    private void checkTrainerFullName() {

        String sql = "SELECT full_name FROM trainers";

        try (Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);)

        {
            while (rs.next()) {
                if (rs.getString("full_name").length() > 3)
                    System.out.println(rs.getString("full_name") + " " + "молодец!");

                else
                    System.out.println(rs.getString("full_name") + " " + "2d топ!");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
