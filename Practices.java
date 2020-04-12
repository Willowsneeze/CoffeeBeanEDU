package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Practices {
	public Scene prac() {
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 600, 600);
		
		Button but = new Button("<");
		but.setLayoutX(522.0); but.setLayoutY(8.0);
		 
		Stop[] stops = new Stop[] { new Stop(0, Color.GRAY), new Stop(1, Color.WHITE)};
        LinearGradient grad = new  LinearGradient(1.0, 1.0, 1.0, 0.02, true, CycleMethod.NO_CYCLE, stops);
        
        Rectangle rect = new Rectangle();
        rect.setArcHeight(5); rect.setArcWidth(5); rect.setHeight(75); rect.setLayoutX(-83); rect.setStroke(Color.BLACK);
        rect.setStrokeWidth(0); rect.setWidth(693); rect.setFill(grad);
		
		Label labelh = new Label("Question #1");
		labelh.setPrefSize(203.0, 37.0); labelh.setLayoutX(199.0); labelh.setLayoutY(81.0);
		labelh.setFont(new Font("Consolas Bold", 30)); labelh.setTextAlignment(TextAlignment.CENTER);
		 
		Button but1 = new Button(">");
		but1.setLayoutX(549.0); but1.setLayoutY(8.0);
		 
		ProgressBar bar = new ProgressBar();
		bar.setLayoutX(247); bar.setLayoutY(42); bar.setPrefSize(300, 20); bar.setProgress(0);
		 
		Circle circle = new Circle();
		circle.setLayoutX(38.0); circle.setLayoutY(38.0); circle.setRadius(30.0); circle.setStroke(Color.BLACK); circle.setStrokeType(StrokeType.INSIDE);
		 
		Label labeli = new Label("Programmer");
		labeli.setLayoutX(79.0); labeli.setLayoutY(13.0);
		labeli.setFont(new Font("Consolas Bold", 24));
		 
		Label labelj = new Label("x Pts.");
		labelj.setLayoutX(79.0); labelj.setLayoutY(41.0);
		labelj.setFont(new Font("Consolas Bold", 18));
		 
		Image backa = new Image(getClass().getResourceAsStream("/resources/titleback.jpg")); ImageView backera = new ImageView(backa);

		Label labelk = new Label("This is where the question goes");
		labelk.setPrefSize(550.0, 75.0); labelk.setLayoutX(10.0); labelk.setLayoutY(10.0); labelk.setPickOnBounds(true);
		labelk.setFont(new Font("Quicksand-Regular", 18));
		 
		TextArea textareaa = new TextArea();
		textareaa.setPrefSize(555.0, 292.0); textareaa.setLayoutX(25.0); textareaa.setLayoutY(552.0);
		 
		Button but2 = new Button("Check");
		but2.setLayoutX(491.0); but2.setLayoutY(502.0); but2.setPrefSize(85.0, 37.0);
		 
		TextArea textareab = new TextArea();
		textareab.setPrefSize(550.0, 37.0); textareab.setLayoutX(25.0); textareab.setLayoutY(551.0);
		
		pane.getChildren().add(backera);
		pane.getChildren().add(labelh);
		pane.getChildren().add(rect);
		pane.getChildren().add(but1);
		pane.getChildren().add(bar);
		pane.getChildren().add(circle);
		pane.getChildren().add(labeli);
		pane.getChildren().add(labelj);
		pane.getChildren().addAll(but, labelk, textareaa, but2, textareab);
		
		return scene;
	}
}
