package pt.iade.shoplist.models;

public class Item {
	private double quantity;
	private Product product;
	public Item(double quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public Product getProduct() {
		return product;
	}
	
	public double getCost() {
		return quantity*product.getPrice();
	}
	
	@Override
	public String toString() {
		return product.getName() + " ("+
				quantity+" x "+
				product.getPrice()+" €) "+
				getCost() + " €";
	}
	
}
