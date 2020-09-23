package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Item;

public class ItemDAOImpl extends DBConnection implements ItemDAO{

	@Override
	public List<Item> getItems() throws SQLException {
		List<Item> itemList = new ArrayList<Item>();
		
		Connection con = super.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM item ;");
       
        while(rs.next()) {
            Item item = new Item(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5));
            itemList.add(item);
        }
		return itemList;
	}

}
