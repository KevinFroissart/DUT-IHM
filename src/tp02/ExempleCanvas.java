package tp02;

import javafx.scene.canvas.*;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.*;

public class ExempleCanvas extends Application {

    public void start(Stage stage) {
            VBox root = new VBox();
            Canvas canvas = new Canvas (300, 300);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.ORANGE);
            gc.fillRect(40, 100, 20, 20);
            gc.setStroke(Color.BLACK);
            gc.strokeRect(40, 100, 20, 20);
            root.getChildren().add(canvas);

            Scene scene = new Scene(root);
            stage.setTitle("Hello Paint");
            stage.setScene(scene);
            stage.show();
    }

    public static void main(String[] args) {
            Application.launch(args);
    }
}