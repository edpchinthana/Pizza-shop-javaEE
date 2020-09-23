package dao;

import java.sql.Connection;

import model.User;

public class UserDAOImpl extends DBConnection implements UserDAO{

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(User user) {
		Connection con = super.getConnection();
		
		return false;
	}
	
}
