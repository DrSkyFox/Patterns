package handlers;

import persists.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataUserHandler implements DataAccess<User> {



    private PreparedStatement get;
    private PreparedStatement delete;
    private PreparedStatement save;

    public DataUserHandler() {
    }

    public void setGet(PreparedStatement get) {
        this.get = get;
    }

    public void setDelete(PreparedStatement delete) {
        this.delete = delete;
    }

    public void setSave(PreparedStatement save) {
        this.save = save;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(User user) {

    }
}
