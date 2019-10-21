package pt.iade.shoplist;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pt.iade.shoplist.controllers.MainController;
import pt.iade.shoplist.controllers.ShopListController;
import pt.iade.shoplist.models.ShopList;

public class WindowManager {

	private static Stage primaryStage;

	public static void setPrimaryStage(Stage primaryStage) {
		WindowManager.primaryStage = primaryStage;
	}

	
	
	public static void openMainWindow() {
		openWindow("views/mainView.fxml",
				primaryStage,new MainController());
		primaryStage.show();
	}

	public static void openShopListWindow(ShopList shopList) {
		Stage stage = new Stage();
		openModalWindow("views/shopListView.fxml",stage,
				primaryStage,new ShopListController(shopList));
		 
		System.out.println("INICIO");
		stage.showAndWait();
		System.out.println("FIM");
	}

	
	public static void openModalWindow(String viewPath, Stage window,
			Stage parentWindow, Object controller) {
		window.initOwner(parentWindow);
		window.initModality(Modality.APPLICATION_MODAL); 
		openWindow(viewPath, window,controller);
		
	}
	

	public static void openWindow(String viewPath, Stage window, 
			Object controller) {
		try {
			FXMLLoader loader = new FXMLLoader(
					Main.class.getResource(viewPath));
			loader.setController(controller);;
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
			window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
}
