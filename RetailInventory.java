public class RetailInventory {
	public static void main(String [] args) {
		String nameA = "Jacket";
		String nameB = "Designer Jeans";
		String nameC = "Shirt";
		
		int unitsA = 12;
		int unitsB = 40;
		int unitsC = 20;
		
		double priceA = 59.95;
		double priceB = 34.95;
		double priceC = 24.95;
		
		RetailItem jacket = new RetailItem(nameA, unitsA, priceA);
		RetailItem jeans = new RetailItem(nameB, unitsB, priceB);
		RetailItem shirt = new RetailItem(nameC, unitsC, priceC);
		
		System.out.println("\tDescription\t\tUnits On Hand\t\tPrice");
		System.out.println("____________________________________________________________________________");
		System.out.println("1)\t" + jacket.getDescription() + "\t\t\t\t" + jacket.getUnitsOnHand() + "\t\t$" + 
		jacket.getPrice());
		System.out.println("2)\t" + jeans.getDescription() + "\t\t\t" + jeans.getUnitsOnHand() + "\t\t$" + 
		jeans.getPrice());
		System.out.println("3)\t" + shirt.getDescription() + "\t\t\t\t" + shirt.getUnitsOnHand() + "\t\t$" + 
		shirt.getPrice());
		System.out.println();
		
	}
}