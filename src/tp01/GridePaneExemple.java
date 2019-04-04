package tp01;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class GridePaneExemple extends Application {

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
		
		GridPane pane = new GridPane();
		
		GridPane.setMargin(b1, new Insets(3));
		GridPane.setMargin(b2, new Insets(3));
		GridPane.setMargin(b3, new Insets(3));
		GridPane.setMargin(b4, new Insets(3));
		GridPane.setMargin(b5, new Insets(3));
		GridPane.setMargin(b6, new Insets(3));
		GridPane.setMargin(b7, new Insets(3));
		GridPane.setMargin(b8, new Insets(3));
		GridPane.setMargin(b9, new Insets(3));
		GridPane.setMargin(b10, new Insets(3));
		
		b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b10.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		
		pane.add(b1, 0, 0);
		pane.add(b2, 1, 0);
		pane.add(b3, 2, 0);
		pane.add(b4, 3, 0);
		pane.add(b5, 0, 1);
		pane.add(b6, 0, 2);
		pane.add(b7, 1, 2);
		pane.add(b8, 0, 3);
		pane.add(b9, 1, 3);
		pane.add(b10, 1, 4);


		
		Scene scene = new Scene(pane, 400, 200);
		stage.setScene(scene);
		stage.setTitle("GridePane exemple");
		stage.setResizable(true);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}