package service.implementation;

import DB.DBConnection;
import buns.Supplier;
import buns.User;

public class Auth {
    public final DBConnection db = DBConnection.getDbConnection();
    public void registerSupplier(Supplier supplier) {
        db.insertSupplier(supplier);
    }
    public void registerUser(User user) {
        db.insertUser(user);
    }

    public User auth(String inputUsername, String inputPassword) {
        User user = db.selectUser(inputUsername);
        if (user.getPassword().equals(inputPassword)) {
            return user;
        } else {
            throw new RuntimeException("Неверный логин или пароль!");
        }
    }
}
