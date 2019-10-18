package pt.iade.shoplist.models.daos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.shoplist.models.ImportedProduct;
import pt.iade.shoplist.models.Item;
import pt.iade.shoplist.models.Product;
import pt.iade.shoplist.models.ShopList;

public final class ShopListDAO {
	
	private ShopListDAO() {}

	private static ObservableList<ShopList> shopLists =
			FXCollections.observableArrayList();

	public static ObservableList<ShopList> getAllShopLists() {
		return shopLists;
	}
	
	// A static block is called the first time the class
	// is used 
	// We will use it to initialize all static attributes
	static {
		ObservableList<Item> items = 
				FXCollections.observableArrayList();
		shopLists.add(new ShopList("Compras de Natal",items));
		// I can add items after adding the lost to shoplist
		// The shoplist has a reference to the same list as "items"
		items.add(new Item(1,new Product("Peru 2kg",10.4)));
		items.add(new Item(4.0,new Product("Batatas",0.9)));
		items.add(new Item(0.5,
				new ImportedProduct("Chocolate Belga",2.3,"França","L&A")));
		items = FXCollections.observableArrayList();
		shopLists.add(new ShopList("Compras de Novembro",items));
		items.add(new Item(4.0,new Product("Batatas",0.9)));
		items.add(new Item(4.0,new Product("Cebolas",0.56)));
	}
}



