package tp02;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Dessiner extends Application{

	ArrayList<Rectangle>al = new ArrayList<Rectangle>();
	Rectangle r;
	GraphicsContext gc;
	
	public void start(Stage stage) {
		VBox root = new VBox();
		Canvas canvas = new Canvas (300, 300);
		gc = canvas.getGraphicsContext2D();
		
		canvas.setOnMouseClicked(e -> {			
			if(e.isShiftDown()) {
				for (int i = 0; i < al.size(); i++) {
					if(e.getX() >= al.get(i).getX() && e.getX() <= al.get(i).getX() + al.get(i).getWidth()){
						if(e.getY() >= al.get(i).getY() && e.getY() <= al.get(i).getY()+ al.get(i).getWidth()) {
							al.remove(i);
							gc.clearRect(e.getX()-10, e.getY()-10, 20, 20);
						}
					}
				}
			}
			else {
				gc.setFill(Color.ORANGE);
				gc.fillRect(e.getX()-10, e.getY()-10, 20, 20);
				gc.setStroke(Color.BLACK);
				gc.strokeRect(e.getX()-10, e.getY()-10, 20, 20);
				al.add(new Rectangle(e.getX()-10, e.getY()-10, 20, 20));
			}
			repaint(canvas);
		});
		
		
		//Incomplet
		canvas.setOnMouseDragged(e -> {
			gc.setFill(Color.ORANGE);
			gc.fillRect(e.getX()-10, e.getY()-10, 20, 20);
			gc.setStroke(Color.RED);
			gc.strokeRect(e.getX()-10, e.getY()-10, 20, 20);
			});
		//Incomplet
		
		root.getChildren().add(canvas);	
		
		Scene scene = new Scene(root);
		stage.setResizable(false);
		stage.setTitle("Dessiner");
		stage.setScene(scene);
		stage.show();
	}
	
	public void repaint(Canvas canvas) {
		canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
		for(int i = 0; i < al.size(); i++) {
			al.get(i).setFill(Color.ORANGE);
			gc.fillRect(al.get(i).getX(), al.get(i).getY(), 20, 20);
			al.get(i).setStroke(Color.BLACK);
			gc.strokeRect(al.get(i).getX(), al.get(i).getY(), 20, 20);
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}