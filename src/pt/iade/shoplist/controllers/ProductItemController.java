package pt.iade.shoplist.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import pt.iade.shoplist.models.Item;


public class ProductItemController {

    @FXML
    private ImageView imageIV;

    @FXML
    private Label nameL;

    @FXML
    private Label quantityAndPriceL;

    @FXML
    private Label totalL;
    
    private Item item;

	public ProductItemController(Item item) {
		this.item = item;
	}

	@FXML
	private void initialize() {
		if (item != null) {
			nameL.setText(item.getProduct().toString());
			quantityAndPriceL.setText(
					item.getQuantity()+
					" X "+
					item.getProduct().getPrice()
					+ " €");
			totalL.setText(item.getCost() + " €");
		}
	}
    
    
    
}
