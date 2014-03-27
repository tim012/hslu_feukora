package ch.feukora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ch.feukora.controller.OverviewController;

public class MainClass extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;
	private Scene scene;

	@Override
	public void start(Stage primaryStage) {

		try {
			FXMLLoader loader = new FXMLLoader(
					MainClass.class.getResource("view/Login.fxml"));
			rootLayout = (AnchorPane) loader.load();
			this.scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setTitle("FEUKORA");
			primaryStage.getIcons().add(
					new Image("file:ressources/A2_Tech_Logo_only.png"));

			primaryStage.show();

			OverviewController controller = loader.getController();
			controller.setMainApp(this);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	public void showOverview() {
		try {
			FXMLLoader loader = new FXMLLoader(
					MainClass.class.getResource("view/MainOverview.fxml"));
			this.rootLayout = (AnchorPane) loader.load();
			this.scene = new Scene(rootLayout);
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
