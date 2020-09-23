package dao;

import java.sql.SQLException;
import java.util.List;

import model.Item;

public interface ItemDAO {
	public List<Item> getItems() throws SQLException;
}
