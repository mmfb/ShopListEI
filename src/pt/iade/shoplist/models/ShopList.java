package pt.iade.shoplist.models;

import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import pt.iade.shoplist.views.itemListView.ImageItemizable;

public class ShopList implements ImageItemizable {
	private int id;
	private String name;
	private ShoplistState state;
	public ShopList(int id,String name) {
		this.id = id;
		this.name = name;
		this.state = ShoplistState.REQUEST;
	}
	@Override
	public String getName() {
		return name;
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
	public int getId() {
		return id;
	}
	
	
}
