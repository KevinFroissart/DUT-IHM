package projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyController {
	@FXML
	Label monLabel;

	public void initialize() {
		System.out.println("Initialisation...");
	}

	public void placerCarre(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}
	
	public void placerRectangle(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}
	
	public void placerLosange(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}
	
	public void placerRond(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}
	
	public void placerTriangle(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}
	
	public void showPopUpTranslation(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}
	
	public void showPopUpRotation(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}
	
	public void showPopUpHomothetie(ActionEvent event) {
		int newValue = Integer.parseInt(monLabel.getText()) + 1;
		monLabel.setText("" + newValue);
	}

}