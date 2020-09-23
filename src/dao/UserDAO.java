package dao;

import java.sql.SQLException;

import model.User;

public interface UserDAO{
	boolean login(User user);
	boolean logout(User user);
	boolean register(User user) throws SQLException, ClassNotFoundException;
	boolean doesUserExists(User user) throws SQLException, ClassNotFoundException;
}
