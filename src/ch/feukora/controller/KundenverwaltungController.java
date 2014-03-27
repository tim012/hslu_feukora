package ch.feukora.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ch.feukora.MainClass;

public class KundenverwaltungController {

	private MainClass mainApp;
	private AnchorPane anchorpane;
	private Stage stage;

	public MainClass getMainApp() {
		return mainApp;
	}

	public void setMainApp(MainClass mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private void handleNeueintrag() {

		try {
			FXMLLoader loader = new FXMLLoader(
					MainClass.class.getResource("view/KundenEintrag.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();
			Scene scene = new Scene(rootLayout);
			Stage stage = new Stage();
			stage.setTitle("FEUKORA");
			stage.getIcons().add(
					new Image("file:ressources/A2_Tech_Logo_only.png"));
			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
