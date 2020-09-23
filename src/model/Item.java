package model;

public class Item {
	private int id;
	private String itemName;
	private String description;
	private double price;
	private String photoUrl;
	
	
	public Item() {
		super();
	}
	
	public Item(int id, String itemName, String description, double price, String photoUrl) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.photoUrl = photoUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	
}
