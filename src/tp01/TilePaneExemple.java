package tp01;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class TilePaneExemple extends Application {

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
		Button b11 = new Button("Bouton 11");
		Button b12 = new Button("Bouton 12");
		Button b13 = new Button("Bouton 13");
		Button b14 = new Button("Bouton 14");
		Button b15 = new Button("Bouton 15");
		Button b16 = new Button("Bouton 16");
		
		TilePane pane = new TilePane(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16);
		
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
		b11.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b12.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b13.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b14.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b15.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b16.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		TilePane.setMargin(b1, new Insets(5));
		TilePane.setMargin(b2, new Insets(5));
		TilePane.setMargin(b3, new Insets(5));
		TilePane.setMargin(b4, new Insets(5));
		TilePane.setMargin(b5, new Insets(5));
		TilePane.setMargin(b6, new Insets(5));
		TilePane.setMargin(b7, new Insets(5));
		TilePane.setMargin(b8, new Insets(5));
		TilePane.setMargin(b9, new Insets(5));
		TilePane.setMargin(b10, new Insets(5));
		TilePane.setMargin(b11, new Insets(5));
		TilePane.setMargin(b12, new Insets(5));
		TilePane.setMargin(b13, new Insets(5));
		TilePane.setMargin(b14, new Insets(5));
		TilePane.setMargin(b15, new Insets(5));
		TilePane.setMargin(b16, new Insets(5));
		
		Scene scene = new Scene(pane, 800, 500);
		stage.setScene(scene);
		stage.setTitle("TilePane exemple");
		stage.setResizable(true);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}