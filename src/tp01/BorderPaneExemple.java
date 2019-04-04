package tp01;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class BorderPaneExemple extends Application {

	public void start(Stage stage) {
		Button N = new Button("North");
		Button S = new Button("South");
		Button E = new Button("East");
		Button W = new Button("West");
		Button C = new Button("Center");


		BorderPane pane = new BorderPane(C,N,E,S,W);
		C.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		N.setMaxWidth(Double.MAX_VALUE);
		S.setMaxWidth(Double.MAX_VALUE);
		E.setMaxHeight(Double.MAX_VALUE);
		W.setMaxHeight(Double.MAX_VALUE);
		
		BorderPane.setMargin(C, new Insets(20));
		BorderPane.setMargin(N, new Insets(20));
		BorderPane.setMargin(S, new Insets(20));
		BorderPane.setMargin(E, new Insets(20));
		BorderPane.setMargin(W, new Insets(20));

		
		Scene scene = new Scene(pane, 1600, 900);
		stage.setScene(scene);
		stage.setTitle("BorderPane exemple");
		stage.setResizable(true);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}