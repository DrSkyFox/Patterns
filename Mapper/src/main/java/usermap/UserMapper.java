package usermap;

import persists.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


public class UserMapper {

    private final Connection connection;

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    public HashMap<Long, User> findAllUsers() {
        HashMap<Long, User> users = new HashMap<Long, User>();
        try {
            PreparedStatement statement = this.connection.prepareStatement("select  id, age, name from users");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                users.put(resultSet.getLong("id"), new User(resultSet.getInt("id"), resultSet.getInt("age"), resultSet.getString("name")));
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return users;
    }

    public User findUsersById(Long id) {
        try {
            PreparedStatement statement = this.connection.prepareStatement("select  id, age, name from users");
            ResultSet resultSet = statement.executeQuery();
            return new User(resultSet.getLong(1), resultSet.getInt(2), resultSet.getString(3));
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    public void insert(User user) throws SQLException {
        PreparedStatement statement =  connection.prepareStatement("insert into users (age, name) values (?, ?)");
        statement.setInt(1, user.getAge());
        statement.setString(2, user.getName());
        statement.executeUpdate();
    }

    public void update(User user) {

    }

}
