package pt.iade.shoplist.views.itemListView;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import pt.iade.shoplist.models.Item;


public class ItemController {

    @FXML
    private ImageView imageIV;

    @FXML
    private VBox descriptionVB;
    
    private ImageItemizable item;

	public ItemController(ImageItemizable item) {
		this.item = item;
	}

	@FXML
	private void initialize() {
		if (item != null) {
			imageIV.setImage(item.getImage());
			for(String line: item.getDescription()) {
				descriptionVB.getChildren().add(
						new Label(line));
			}
		}
	}
    
    
    
}
