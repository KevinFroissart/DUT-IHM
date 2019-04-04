package tp01;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class PaneExemple extends Application {

	public void start(Stage stage) {
		Button b1 = new Button("Bouton 1");
		Button b2 = new Button("Bouton 2");
		
		Pane pane = new Pane(b1,b2);

		b1.setLayoutX(10);
		b1.setLayoutY(20);

		b2.setLayoutX(40);
		b2.setLayoutY(70);
		
		Scene scene = new Scene(pane, 400, 200);
		stage.setScene(scene);
		stage.setTitle("Pane exemple");
		stage.setResizable(true);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}