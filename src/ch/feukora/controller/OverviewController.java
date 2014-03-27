package ch.feukora.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Dialogs;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ch.feukora.MainClass;
import ch.feukora.util.DateFormat;

public class OverviewController {

	private MainClass mainApp;
	@FXML
	private PasswordField passwort;
	@FXML
	private TextField benutzer;

	private Stage dialog;

	public void setMainApp(MainClass mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private AnchorPane place;

	@FXML
	private static Label time;
	@FXML
	private static Label date;

	private static void updateDate() {
		date.setText(DateFormat.getDate());
	}

	private static void updateTime() {
		time.setText(DateFormat.getTime());
	}

	@FXML
	private void handleStart() {
		if (passwort.getText().length() == 0) {
			Dialogs.showInformationDialog(dialog, "Kein Passwort eingegeben");
		} else if (benutzer.getText().length() == 0) {
			Dialogs.showInformationDialog(dialog, "Kein Benutzer eingegebn");
		} else if (0 != passwort.getText().length()
				|| benutzer.getText().length() != 0) {
			mainApp.showOverview();
			updateTime();
			updateDate();
		}

	}

	@FXML
	private void handleKundenverwaltung() {
		try {
			place.getChildren().clear();
			FXMLLoader loader = new FXMLLoader(
					MainClass.class.getResource("view/Kundenverwaltung.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			place.getChildren().add(pane);
			KundenverwaltungController controller = loader.getController();
			controller.setMainApp(mainApp);

		} catch (Exception e) {
			e.printStackTrace();
		}
		updateTime();
		updateDate();
	}

	@FXML
	private void handleTerminverwaltung() {
		try {
			place.getChildren().clear();
			FXMLLoader loader = new FXMLLoader(
					MainClass.class.getResource("view/Terminverwaltung.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			place.getChildren().add(pane);

		} catch (Exception e) {
			e.printStackTrace();
		}
		updateTime();
		updateDate();
	}

	@FXML
	private void handleMitarbeiterverwaltung() {
		try {
			place.getChildren().clear();
			FXMLLoader loader = new FXMLLoader(
					MainClass.class
							.getResource("view/Mitarbeiterverwaltung.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			place.getChildren().add(pane);

		} catch (Exception e) {
			e.printStackTrace();
		}
		updateTime();
		updateDate();
	}

	@FXML
	private void handleProduktverwaltung() {
		try {
			place.getChildren().clear();
			FXMLLoader loader = new FXMLLoader(
					MainClass.class.getResource("view/Produktverwaltung.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			place.getChildren().add(pane);

		} catch (Exception e) {
			e.printStackTrace();
		}
		updateTime();
		updateDate();
	}

	@FXML
	private void handleRapportverwaltung() {
		try {
			place.getChildren().clear();
			FXMLLoader loader = new FXMLLoader(
					MainClass.class.getResource("view/Rapportverwaltung.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			place.getChildren().add(pane);

		} catch (Exception e) {
			e.printStackTrace();
		}
		updateTime();
		updateDate();
	}

	@FXML
	private void handleEnd() {
		System.exit(0);
	}

}
