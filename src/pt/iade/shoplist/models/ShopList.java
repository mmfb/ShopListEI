package pt.iade.shoplist.models;

import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import pt.iade.shoplist.views.itemListView.ImageItemizable;

public class ShopList implements ImageItemizable {
	private String name;
	private ShoplistState state;
	private ObservableList<Item> items;
	public ShopList(String name, ObservableList<Item> items) {
		this.name = name;
		this.items = items;
		this.state = ShoplistState.REQUEST;
	}
	@Override
	public String getName() {
		return name;
	}
	public ObservableList<Item> getItems() {
		return items;
	}
	@Override
	public String toString() {
		return  getName();
	}
	@Override
	public String[] getDescription() {
		return new String[] {name +" "+state,
							state.getMessage()};
	}
	@Override
	public Image getImage() {
		return null;
	}
	
	
}
