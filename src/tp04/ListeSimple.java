package tp04;


import java.io.File;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ListeSimple extends Application {
	Label label;
	ListView<String> list = new ListView<String>();
	ListView<String> sousList = new ListView<String>();
	

	class MonSousListChangeListener implements ListChangeListener<String> {
		public void onChanged(javafx.collections.ListChangeListener.Change<? extends String> c){
			
			label.setText("Selection de " + c.getList().get(0));

		}
	}


	class MonListChangeListener implements ListChangeListener<String> {
		public void onChanged(javafx.collections.ListChangeListener.Change<? extends String> c){
			label.setText("Selection de " + c.getList().get(0));
			File sousPath = new File("/usr/include/"+c.getList().get(0));
			String[] sousFileList = sousPath.list();
			sousList.getItems().clear();
			if(sousPath.isDirectory()) {
				sousList.getItems().addAll(sousFileList);
				if(sousFileList.length > 0) sousList.getSelectionModel().getSelectedItems().addListener(new MonSousListChangeListener());
			} 
		}
	}

	public void start(Stage stage) {
		File path = new File("/usr/include/");
		String[] filelist = path.list();
		label = new Label("Aucune selection");
		list.getItems().addAll(filelist);
		list.getSelectionModel().getSelectedItems().addListener(new MonListChangeListener());

		//sousList.getSelectionModel().getSelectedItems().addListener(new MonListChangeListener());


		HBox root = new HBox();
		root.setAlignment(Pos.CENTER_LEFT);
		root.setSpacing(10.0);
		root.setPadding(new Insets(3, 3, 3, 3));
		root.getChildren().addAll(list,sousList,label);

		Scene scene = new Scene(root, 700, 300);
		stage.setTitle("File explorer");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}