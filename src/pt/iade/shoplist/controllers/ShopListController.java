package pt.iade.shoplist.controllers;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import pt.iade.shoplist.WindowManager;
import pt.iade.shoplist.models.ImportedProduct;
import pt.iade.shoplist.models.Item;
import pt.iade.shoplist.models.Product;
import pt.iade.shoplist.models.ShopList;
import pt.iade.shoplist.views.itemListView.ItemListView;

public class ShopListController {
    @FXML
    private ItemListView<Item> itemsLV;

    @FXML
    private Label nameL;
    
    private ShopList shopList;
    
 
    public ShopListController(ShopList shopList) {
    	this.shopList = shopList;
    }
    
    @FXML
    private void initialize() {
    	itemsLV.setItems(shopList.getItems());
    	// this determines what is the layout of each cell
    	/*
    	  itemsLV.setCellFactory((listView) -> {
    	 
    	 return new ListCell<Item>() {
    		  public void updateItem(Item item, boolean empty) {
    			if (item == null || empty) {
    				// nullify all content if no item exists
    				 setText(null);
    		         setGraphic(null);
    			}  else {
    				try {
    					// load and set the layout for the item
						Parent node = WindowManager.createNewNodeTree(
										"views/productItemView.fxml",
								new ProductItemController(item));
						setText(null);
						setGraphic(node);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			}
    		  } 
    	 };
    	});
    	*/
    	nameL.setText(shopList.getName());
 
    }
    
    @FXML
    private void backToMain() {
    	WindowManager.backToMainWindow();
    }
}
