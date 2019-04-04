package tp01;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class FlowPaneExemple extends Application {

	public void start(Stage stage) {
		Button b1 = new Button("Bouton 1");
		Button b2 = new Button("Bouton 2");
		Button b3 = new Button("Bouton 3");
		Button b4 = new Button("Bouton 4");
		Button b5 = new Button("Bouton 5");
		Button b6 = new Button("Bouton 6");
		Button b7 = new Button("Bouton 7");
		Button b8 = new Button("Bouton 8");
		Button b9 = new Button("Bouton 9");
		Button b10 = new Button("Bouton 10");

		FlowPane pane = new FlowPane(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10);
		//VBox root = new VBox(pane);
		//FlowPane.setMargin(b1, new Insets(20));
		HBox rate = new HBox(pane);
		
		Scene scene = new Scene(rate, 300, 50);
		stage.setScene(scene);
		stage.setTitle("FlowPlane 10");
		stage.setResizable(true);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}