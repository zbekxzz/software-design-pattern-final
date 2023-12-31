package DB;

import buns.Supplier;
import buns.User;
import buns.Status;
import service.observing.EmailSupplier;
import service.observing.OrderObserver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static DBConnection dbConnection;
    private static final String url = "jdbc:postgresql://localhost:5432/bekcafe";
    private static final String username = "postgres";
    private static final String password = "Zbekxzz3";
    private Connection connection;

    private DBConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBConnection getDbConnection() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    public void insertUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id, username, status, password) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, Math.toIntExact(user.getId()));
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getStatus().toString());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public User selectUser(String inputUsername) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from users where username = ? limit 1");
            preparedStatement.setString(1, inputUsername);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                long id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                Status status = Status.valueOf(resultSet.getString("status"));
                return new User(id, username, status, password);
            }
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        return null;
    }

    public void insertSupplier(Supplier supplier) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO suppliers (id, nametag, supplieremail) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, supplier.getId());
            preparedStatement.setString(2, supplier.getNameTag());
            preparedStatement.setString(3, supplier.getSupplierEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<OrderObserver> selectAllSuppliers() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT supplieremail from suppliers");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<OrderObserver> supplierEmails = new ArrayList<>();

            while (resultSet.next()) {
                String value = resultSet.getString("supplieremail");
                OrderObserver supplier = new EmailSupplier(value);
                supplierEmails.add(supplier);
            }
            return supplierEmails;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}