package pt.iade.shoplist.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.shoplist.models.ImportedProduct;
import pt.iade.shoplist.models.Item;
import pt.iade.shoplist.models.Product;

public class ShopListController {
    @FXML
    private ListView<Item> shoplistLV;

    private ObservableList<Item> shoplist =
    		FXCollections.observableArrayList();
    
    @FXML
    private void initialize() {
    	shoplistLV.setItems(shoplist);
    	shoplist.add(new Item(0.5,
    			new Product("Batata",0.93)));
    	shoplist.add(new Item(0.6,
    			new ImportedProduct("Cebola XSD", 0.67,
    					"Espanha", "José & José ltd")));
    	shoplist.add(new Item(3,
    			new Product("Pão",0.23)));
 
    }
}
