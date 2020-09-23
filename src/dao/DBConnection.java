package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	protected Connection getConnection() {
		Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pizza_shop", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
		
	}
	protected void closeConnection(Connection connection) throws SQLException {
			connection.close();
	}
}
