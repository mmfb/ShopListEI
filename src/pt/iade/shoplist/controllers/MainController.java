package pt.iade.shoplist.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.shoplist.models.ShopList;

public class MainController {

    @FXML
    private ListView<ShopList> shoplistLV;

	
	@FXML
	private void initialize() {
		
	}

	
    @FXML
    private void addShopList(ActionEvent event) {
    	System.out.println("Clicked");
    }

}
