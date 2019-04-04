package tp01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SimpleScene extends Application {

  public void start(Stage stage) {
    VBox root = new VBox();
    Label msg = new Label("Hello JavaFX");
    root.getChildren().add(msg);

    Scene scene = new Scene(root, 500, 300);
    stage.setScene(scene);
    stage.setTitle("Hello JavaFX");
    //stage.setFullScreen(true);
    //stage.setResizable(false);
    //stage.initStyle(StageStyle.TRANSPARENT);
    stage.initStyle(StageStyle.DECORATED);
    //stage.initStyle(StageStyle.UNDECORATED);
    //stage.initStyle(StageStyle.UTILITY);
    stage.show();
    
    Stage newStage = new Stage();
    newStage.initOwner(stage);
    newStage.initModality(Modality.APPLICATION_MODAL);
    newStage.setX(stage.getX()+stage.getWidth());
    newStage.setY(stage.getY());
    newStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
