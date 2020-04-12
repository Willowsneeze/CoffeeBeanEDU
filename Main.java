package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	Image back = new Image(getClass().getResourceAsStream("/resources/titleback.jpg"));
    	ImageView backer = new ImageView(back);
    	backer.setFitHeight(600); backer.setFitWidth(600);
    	
        Pane root = new Pane();
        primaryStage.setTitle("CoffeeBean");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/cb.png")));
        primaryStage.setScene(new Scene(root, 600, 600));
        
        Label label1 = new Label("by Alex Yeghikian, James Streett, and Daniel Torres Pomares");
        label1.setPrefHeight(32.0); label1.setPrefWidth(492.0); label1.setLayoutX(54.0); label1.setLayoutY(561.0); label1.setFont(Font.loadFont(getClass().getResource("/resources/Quicksand-Bold.otf").toExternalForm(), 16)); label1.setTextAlignment(TextAlignment.CENTER); label1.setTextFill(Color.WHITE);
        
        Label label2 = new Label("A project for TitanHacks 2020");
        label2.setPrefHeight(30); label2.setPrefWidth(538); label2.setLayoutX(179); label2.setLayoutY(538); label2.setTextAlignment(TextAlignment.CENTER); label2.setTextFill(Color.WHITE); label2.setFont(Font.loadFont(getClass().getResource("/resources/Quicksand-Bold.otf").toExternalForm(), 16));
        
        Label label3 = new Label("CoffeeBean");
        label3.setLayoutX(129); label3.setLayoutY(62); label3.setFont(Font.loadFont(getClass().getResource("/resources/HenryMorganHand.ttf").toExternalForm(), 122));
        
        Label labela = new Label("v0.1.0");
        labela.setLayoutX(213.0); labela.setLayoutY(183.0);
        labela.setFont(new Font("Times New Roman Bold", 12));
        
        Label labelb = new Label("Educational Software for Teaching the Java Programming Language");
        labelb.setPrefHeight(45.0); labelb.setPrefWidth(300.0); labelb.setLayoutX(150.0); labelb.setLayoutY(242.0);
        labelb.setFont(Font.loadFont(getClass().getResource("/resources/Quicksand-BoldItalic.otf").toExternalForm(), 16)); labelb.setTextAlignment(TextAlignment.CENTER); labelb.setWrapText(true);
        
        Button but1 = new Button("Learn");
        but1.setPrefHeight(50); but1.setPrefWidth(150); but1.setLayoutX(225); but1.setLayoutY(320);
        
        but1.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				Controller control = new Controller();
				try {
					primaryStage.setScene(control.basics());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
        	
        });
        
        Button but2 = new Button("Load");
        but2.setLayoutX(225); but2.setLayoutY(380); but2.setPrefSize(150, 52);
        
        but2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

			}
        	
        });
        
        Button but3 = new Button("Practice");
        but3.setLayoutX(225); but3.setLayoutY(472); but3.setPrefSize(150, 52);
        
        but3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Practices prac = new Practices();
				primaryStage.setScene(prac.prac());
			}
        	
        });
        
        root.getChildren().add(backer);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);
        root.getChildren().addAll(but1, but2, but3);
        root.getChildren().addAll(labela, labelb);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
