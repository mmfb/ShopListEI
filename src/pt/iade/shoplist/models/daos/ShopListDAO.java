package pt.iade.shoplist.models.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.shoplist.models.ImportedProduct;
import pt.iade.shoplist.models.Item;
import pt.iade.shoplist.models.Product;
import pt.iade.shoplist.models.ShopList;

public final class ShopListDAO {

	private ShopListDAO() {}

	/*
	private static ObservableList<ShopList> shopLists =
			FXCollections.observableArrayList();
	 */
	public static ObservableList<ShopList> getAllShopLists() {
		ObservableList<ShopList> shopLists =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("Select * from shoplists"))
		{
			while (rs.next()) {
				String name= rs.getString("name");
				int id = rs.getInt("id");
				shopLists.add(new ShopList(id,name));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return shopLists;
	}

	public static ObservableList<Item> getShopListItems(int id) {
		ObservableList<Item> itens =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		String sql = "Select product_id ,quantity,name,country, price "+
				" from items, products where shoplist_id = ? and "+
				"id = product_id;";
		try (PreparedStatement stat = conn.prepareStatement(sql)){
			stat.setInt(1,id);
			try(ResultSet rs = stat.executeQuery()) {
				while (rs.next()) {
					String name = rs.getString("name");
					int productId = rs.getInt("product_id");
					double quant = rs.getDouble("quantity");
					double price = rs.getDouble("price");
					String country = rs.getString("country");
					Product p;
					if (country == null) p = new Product(name,price);
					else p = new ImportedProduct(name, price, country, "");
					itens.add(new Item(quant,p));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return itens;
	}
}


// A static block is called the first time the class
// is used 
// We will use it to initialize all static attributes
/*
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
 */



