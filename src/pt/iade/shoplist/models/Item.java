package pt.iade.shoplist.models;

import javafx.scene.image.Image;
import pt.iade.shoplist.views.itemListView.ImageItemizable;

public class Item implements ImageItemizable {
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
	@Override
	public String getName() {
		return toString();
	}
	@Override
	public Image getImage() {
		return null;
	}
	@Override
	public String[] getDescription() {
		String [] desc = new String[3];
		desc[0]=product.getName() ;
		desc[1]=quantity+" x "+	product.getPrice()+" €";
		desc[2]= "Total: "+	getCost() + " €";
		return desc; 
	}
	
}
