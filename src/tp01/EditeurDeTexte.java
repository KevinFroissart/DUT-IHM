package tp01;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class EditeurDeTexte extends Application {

	public void start(Stage stage) {
		
	Label res = new Label("Rechercher");
	TextField recherche = new TextField();
	Button fg = new Button("<-");
	Button fd = new Button("->");
	Button sur = new Button("Tout surligner");
	TextArea type = new TextArea();
	Menu fichier = new Menu("Fichier");
	Menu edition = new Menu("Edition");
	MenuItem nouveau = new MenuItem("Nouveau");
	MenuItem ouvrir = new MenuItem("Ouvrir");
	MenuItem enregistrer = new MenuItem("Enregistrer");
	MenuItem enregistrerS = new MenuItem("Enregistrer sous");
	MenuItem miseEP = new MenuItem("Mise en page");
	MenuItem impre = new MenuItem("Imprimer");
	MenuItem quit = new MenuItem("Quitter");
	fichier.getItems().addAll(nouveau,ouvrir,enregistrer,enregistrerS,miseEP,impre,quit);
	MenuBar menu = new MenuBar(fichier, edition);
	HBox hbox = new HBox(res, recherche, fg, fd, sur);
	VBox vbox = new VBox(menu, type, hbox);
	Scene scene = new Scene(vbox, 800, 1000);
	stage.setScene(scene);
	stage.setTitle("Editeur de texte");
	stage.setResizable(true);
	stage.show();
}

public static void main(String[] args) {
	Application.launch(args);
}
}