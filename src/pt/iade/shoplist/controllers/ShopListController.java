package pt.iade.shoplist.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import pt.iade.shoplist.WindowManager;
import pt.iade.shoplist.models.ImportedProduct;
import pt.iade.shoplist.models.Item;
import pt.iade.shoplist.models.Product;
import pt.iade.shoplist.models.ShopList;

public class ShopListController {
    @FXML
    private ListView<Item> itemsLV;

    @FXML
    private Label nameL;
    
    private ShopList shopList;
    
 
    public ShopListController(ShopList shopList) {
    	this.shopList = shopList;
    }
    
    @FXML
    private void initialize() {
    	itemsLV.setItems(shopList.getItems());
    	nameL.setText(shopList.getName());
    }
    
    @FXML
    private void backToMain() {
    	WindowManager.backToMainWindow();
    }
}
