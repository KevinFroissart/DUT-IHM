package tp02;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DessinerPers extends Application {

	ArrayList<Rectangle> arrayR = new ArrayList<Rectangle>();
	Rectangle r, selection;
	GraphicsContext gc;

	public void start(Stage stage) {
		VBox root = new VBox();
		Canvas canvas = new Canvas(300, 300);
		gc = canvas.getGraphicsContext2D();
		
		root.getChildren().add(canvas);
		
		
		root.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
			if(event.isControlDown()) {
				
			}
			if (event.isShiftDown()) {
				for (int i = 0; i < arrayR.size(); i++) {
					if (event.getX() >= arrayR.get(i).getX() && event.getX() <= arrayR.get(i).getX() + arrayR.get(i).getWidth()) {
						if (event.getY() >= arrayR.get(i).getY() && event.getY() <= arrayR.get(i).getY() + arrayR.get(i).getWidth()) {
							selection = arrayR.get(i);
							gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
							arrayR.remove(selection);
							repaint();
						}
					}
				}
			} else {
				arrayR.add(new Rectangle(event.getX() - 10, event.getY() - 10, 20, 20));
				repaint();
			}
			
			}

		});
		root.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				for (int i = 0; i < arrayR.size(); i++) {
					if (event.getX() >= arrayR.get(i).getX() && event.getX() <= arrayR.get(i).getX() + arrayR.get(i).getWidth()) {
						if (event.getY() >= arrayR.get(i).getY() && event.getY() <= arrayR.get(i).getY() + arrayR.get(i).getWidth()) {
							selection = arrayR.get(i);
						}
					} 
				}
			}

		});
		root.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				selection = null;
			}

		});
		root.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if(selection != null) Platform.runLater(new Runnable() {

					@Override
					public void run() {
						selection.setX(event.getX() - 10);
						selection.setY(event.getY() - 10);
						gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
						repaint();					
					}
				});
			}	
		});
		root.setOnMouseMoved(new EventHandler<MouseEvent>() {
			Rectangle r;
			@Override
			public void handle(MouseEvent event) {
				for (int i = 0; i < arrayR.size(); i++) {
					if (event.getX() >= arrayR.get(i).getX() && event.getX() <= arrayR.get(i).getX() + arrayR.get(i).getWidth()) {
						if (event.getY() >= arrayR.get(i).getY() && event.getY() <= arrayR.get(i).getY() + arrayR.get(i).getWidth()) {
							r = arrayR.get(i);
							gc.setFill(Color.ORANGE);
							gc.fillRect(r.getX(), r.getY(), r.getWidth(),
									r.getHeight());
							gc.setStroke(Color.RED);
							gc.strokeRect(r.getX(), r.getY(), r.getWidth(),
									r.getHeight());
						} 
					}
				}
				if(r == null) repaint();
				else repaint(r);
			}

		});

		Scene scene = new Scene(root);
		stage.setTitle("Hello Paint");
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	private void repaint() {
		for (int a = 0; a < arrayR.size(); a++) {
			gc.setFill(Color.ORANGE);
			gc.fillRect(arrayR.get(a).getX(), arrayR.get(a).getY(), arrayR.get(a).getWidth(), arrayR.get(a).getHeight());
			gc.setStroke(Color.BLACK);
			gc.strokeRect(arrayR.get(a).getX(), arrayR.get(a).getY(), arrayR.get(a).getWidth(),//carré = position du pointeur de la souris) puis de les faire disparaître en cliquant 
			arrayR.get(a).getHeight());
		}
	}

	private void repaint(Rectangle r) {
		for (int a = 0; a < arrayR.size(); a++) {
			if(arrayR.get(a) != r) {
				gc.setFill(Color.ORANGE);
				gc.fillRect(arrayR.get(a).getX(), arrayR.get(a).getY(), arrayR.get(a).getWidth(),
						arrayR.get(a).getHeight());
				gc.setStroke(Color.BLACK);
				gc.strokeRect(arrayR.get(a).getX(), arrayR.get(a).getY(), arrayR.get(a).getWidth(),
						arrayR.get(a).getHeight());
			}
		}
	}

}