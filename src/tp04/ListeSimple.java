package tp04;


import java.io.File;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class ListeSimple extends Application {
	Label label;
	ListView<String> list = new ListView<String>();
	ListView<String> sousList = new ListView<String>();
	

	class MonRenduDeCellule extends ListCell<String> {
	    public void updateItem(String item, boolean empty) {
	      super.updateItem(item, empty);
	      Canvas c = new Canvas(200, 20);
	      GraphicsContext gc = c.getGraphicsContext2D();

	      Image file = new Image("res/file.png");
	      Image folder = new Image("res/folder.png");
	      gc.drawImage(folder, 5, 5);
	      setGraphic(c);
	    }
	}
	
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

		list.setCellFactory(new Callback<ListView<String>,
		        ListCell<String>>() {
		            @Override
		            public ListCell<String> call(ListView<String> list) {
		                return new MonRenduDeCellule();
		            }
		        }
		);
		
		
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