package pt.iade.shoplist.controllers;
import java.io.IOException;

import javax.swing.event.ChangeEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import pt.iade.shoplist.Main;
import pt.iade.shoplist.WindowManager;
import pt.iade.shoplist.models.ShopList;
import pt.iade.shoplist.models.daos.ShopListDAO;

public class MainController {

	@FXML
	private ListView<ShopList> shoplistLV;


	@FXML
	private void initialize() {
		shoplistLV.setItems(ShopListDAO.getAllShopLists());
		
		shoplistLV.getSelectionModel().
			selectedItemProperty().addListener(
				(obs,oldVal,newVal)-> {
					openShopList(newVal);
				});

	}


	private void openShopList(ShopList selected) {
		WindowManager.openShopListWindow(selected);
	}




	@FXML
	private void addShopList(ActionEvent event) {
		System.out.println("Clicked");
	}

}
