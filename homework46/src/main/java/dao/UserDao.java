package dao;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public boolean addUser(User user){
        String SQL = "insert into users (name, password, date_created) values(?,?, now()) ";
        try(Connection conn = DbConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getPassword());
            stmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<>();
        String SQL = "select * from users";
        try(Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            while (rs.next()){
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getTimestamp("created_date")
                );
                userList.add(user);
            }
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return userList;
    }

    public User getUserById(int id){
        String SQL = "select * from users where id = ?";
        User user = null;
        try(Connection conn = DbConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setInt(1, id);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next())
                    user = new User(
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getTimestamp("created_date")
                );
            }
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return user;
    }

    public boolean deleteUser(int id){
        String SQL = "delete from users where id = ?";
        try(Connection conn = DbConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    public boolean updateUser(int id, String name, String password){
        String SQL = "update users set name = ?, password = ? where id = ?";
        try(Connection conn = DbConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setString(1, name);
            stmt.setString(2, password);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            return true;
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
}
