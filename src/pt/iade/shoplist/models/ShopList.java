package pt.iade.shoplist.models;

import javafx.collections.ObservableList;

public class ShopList {
	private String name;
	private ObservableList<Item> items;
	public ShopList(String name, ObservableList<Item> items) {
		super();
		this.name = name;
		this.items = items;
	}
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
}
