package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	public boolean register(User user) throws SQLException, ClassNotFoundException {
		if(!doesUserExists(user)) {
			Connection con = super.getConnection();
			Statement stmt = con.createStatement();
	        stmt.executeUpdate("INSERT INTO `user`(`displayName`, `emailAddress`,`password`) VALUES ('" +user.getDisplayName() + "','" + user.getEmailAddress() + "','"+user.getPassword()+"');");
	        super.closeConnection(con);
	        return true;
		}
		return false;
	}

	@Override
	public boolean doesUserExists(User user) throws SQLException, ClassNotFoundException {
		Connection con = super.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT emailAddress FROM user WHERE emailAddress='"+user.getEmailAddress()+"';");
        
        while(rs.next()) {
            if(rs.getString(0).equals(user.getEmailAddress())) {
            	return true;
            }
        }
		return false;
	}
	
}
