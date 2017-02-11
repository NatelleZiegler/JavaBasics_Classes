public class RetailItem {
	private String description; //holds a brief description of the item
	private int unitsOnHand; //holds the number of units currently in inventory
	private double price; //holds the item's retail price
	
	public RetailItem(String about, int units, double unitPrice) {
		description = about;
		unitsOnHand = units;
		price = unitPrice;
	}
	
	//mutator methods
	public void setDescription(String about) {
		description = about;
	}
	
	public void setUnitsOnHand(int units) {
		unitsOnHand = units;
	}
	
	public void setPrice(double unitPrice) {
		price = unitPrice;
	}
	
	//accessor methods
	
	public String getDescription() {
		return description;
	}
	
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	
	public double getPrice() {
		return price;
	}
}