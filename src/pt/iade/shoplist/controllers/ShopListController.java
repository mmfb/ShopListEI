package pt.iade.shoplist.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ShopListController {
    @FXML
    private ListView<String> shoplistLV;

    private ObservableList<String> shoplist =
    		FXCollections.observableArrayList();
    
    @FXML
    private void initialize() {
    	shoplistLV.setItems(shoplist);
    	shoplist.add("Batatas");
    	shoplist.add("Cebolas");
    	shoplist.add("Pão");
 
    }
}
