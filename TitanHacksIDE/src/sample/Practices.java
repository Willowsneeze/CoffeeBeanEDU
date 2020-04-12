package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
	
	int ln = 0;
	double level;
	int pts;
	
	public Scene prac() {
		
		HashMap<Integer, String> prac = new HashMap<Integer, String>();
		
		prac.put(0, "Write a method named \"findprime\" that is given an int array as an argument. Print out all prime numbers in the int array with spaces in between each int. Ex {3,4,6,7} -> 7 3");
		prac.put(1, "Write a method named \"removethezeros\" that takes an int as an argument. The method removes all zeros from the int and prints the new int. Ex. 150670 -> 1567");
		prac.put(2, "Write a method named \"getalphabetized\" that alphabetizes the characters in the given string argument. Return the new formatted string. Ex. cab -> abc");
		prac.put(3, "Write a method named \"alphabetize\" that alphabetizes the words in the given string array argument. Print the words in order with spaces between each string. Ex. {\"bird\",\"horse\",\"dog\",\"lizard\"} -> bird dog horse lizard");
		prac.put(4, "Write a method named “highestnum” which has an int arraylist as an argument. Locate and print the highest number in the arraylist. Ex. {4,6,7,3,1,8,9} -> 9");
		prac.put(5, "Write a method named “lowestnum” which has an int arraylist as an argument. Locate and print the lowest number in the arraylist. Ex. {4,6,7,3,1,8,9} -> 1");
		prac.put(6, "Write a method named “removeNumbers” with a given string argument. This method removes all numbers in the string. Print the new string. Ex. App3le");
		prac.put(7, "Write a method named “replaceLetter” with a string and char argument. The method locates the char arguments in the string and replaces it with the first letter of the string. The method then prints out the new string. Ex. String: orange char: g -> oranoe");
		prac.put(8, "Write a method named “removeVowels” with a given string argument. This method removes all vowels from the given string. The method then prints this new string. Ex. monkey -> mnky");
		prac.put(9, "Write a method named \"removeOddNums\" that takes in an int arraylist as an argument. Return the arraylist without any odd ints. Ex {4,6,7,3,2,7} -> {4,6,2}");
		prac.put(10, "Write a method named “getHighkeyLowValue” that has a hashmap named “map” (having the key be an Integer and the value as a String) and an arraylist named “list” (Integer arraylist). Return a new hashmap (key = the highest int in the arraylist, value = the corresponding value of the key in the hashmap [the key being the lowest number in the arraylist])");
		prac.put(11, "Write a method named “getGreater10” that makes an array of all ints greater than or equal to 10 from the 2d array argument in the method. Return an arraylist with the ints ordered greatest to least. Ex. { {4,56}, {12,10}} -> {56,12,10}");
		prac.put(12, " Write a method named “getHours” that takes in an int called “seconds” This method converts the int called “seconds” to hours. Return the number of hours. (Hint use a double) Ex. 5400 - > 1.5");
		prac.put(13, "Write a method named “getSpots” that takes in a string 2d array as an argument. Iterate through the 2d array and return the number of “spots” that are in the 2d array. Ex { {“Blank”,”spots”},{“spots”, “spots”}} -> 3");
		prac.put(14, "Write a method called “QuadraticEq” which takes in 3 ints [a,b,c]. Use the quadratic formula with the respective ints. Print out the new int. Hint(( (-b + √ (b^2-4ac) )/2a) [Notice: the formula is only +, not +/-] Ex. int a: 2 int b: 5 c: 2 - > -1");
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 600, 600);
		
		level = (double)1/(prac.size()-1);
		
		 Stop[] stops = new Stop[] { new Stop(0, Color.GRAY), new Stop(1, Color.WHITE)};
	        LinearGradient grad = new  LinearGradient(1.0, 1.0, 1.0, 0.02, true, CycleMethod.NO_CYCLE, stops);
	        
	        Rectangle rect = new Rectangle();
	        rect.setArcHeight(5); rect.setArcWidth(5); rect.setHeight(75); rect.setLayoutX(-83); rect.setStroke(Color.BLACK);
	        rect.setStrokeWidth(0); rect.setWidth(693); rect.setFill(grad);
	       
	        
	        Circle circ = new Circle();
	        circ.setLayoutX(38); circ.setLayoutY(38); circ.setRadius(20); circ.setStroke(Color.BLACK); circ.setStrokeType(StrokeType.INSIDE);
	        
	        ImageView cup = new ImageView(new Image(getClass().getResourceAsStream("/resources/img1.png")));
	        cup.setFitHeight(56); cup.setFitWidth(56); cup.setLayoutX(10); cup.setLayoutY(10); cup.setPickOnBounds(true); cup.setPreserveRatio(true);
	        
	        Button but4 = new Button();
	        but4.setShape(circ); but4.setGraphic(cup); but4.setLayoutX(10); but4.setLayoutY(10);
	        but4.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {		
				}
	        	
	        });
	        
	        Button but3 = new Button("<");
	        but3.setLayoutX(522); but3.setLayoutY(8);
	        
	        Button but2 = new Button(">");
	        but2.setLayoutX(548); but2.setLayoutY(8);
	        
			Label labelk = new Label(prac.get(0));
			labelk.setPrefSize(550.0, 100.0); labelk.setLayoutX(10.0); labelk.setLayoutY(110); labelk.setPickOnBounds(true); labelk.setWrapText(true);
			labelk.setFont(Font.loadFont(getClass().getResource("/resources/Quicksand-Bold.otf").toExternalForm(), 12));
			
	        ProgressBar bar = new ProgressBar();
	        bar.setLayoutX(247); bar.setLayoutY(42); bar.setPrefSize(300, 20); bar.setProgress(0);
	        	        
	        but2.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent event) {
	                ln++;
	            	if(ln < prac.size()){
	            		bar.setProgress(level*ln);
	            		labelk.setText(prac.get(ln));
	            		labelk.setText(prac.get(ln));
	            	}else {
	            		ln--;
	            	}
	            }
	        	
	        });
	        
	        but3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
	                ln--;
	            	if(ln < prac.size()){
	            		bar.setProgress(level*ln);
	            		labelk.setText(prac.get(ln));
	            		labelk.setText(prac.get(ln));
	            	}else {
	            		ln++;
	            	}
					
				}
	        	
	        });
	        
	        Label labeld = new Label("Question:");
	        labeld.setPrefHeight(30.0); labeld.setPrefWidth(150.0); labeld.setLayoutX(20.0); labeld.setLayoutY(90.0);
	        labeld.setFont(new Font("Consolas Bold", 24));
	        
	        Label labelf = new Label("Programmer");
	        labelf.setLayoutX(79.0); labelf.setLayoutY(13.0);
	        labelf.setFont(new Font("Consolas Bold", 24));
	        
	        Label labelg = new Label("x Pts.");
	        labelg.setPrefHeight(22.0); labelg.setPrefWidth(132.0); labelg.setLayoutX(79.0); labelg.setLayoutY(41.0);
	        labelg.setFont(new Font("Consolas Bold", 18));
		 
		Image backa = new Image(getClass().getResourceAsStream("/resources/titleback.jpg")); ImageView backera = new ImageView(backa);

		 
		TextArea textareaa = new TextArea();
		textareaa.setPrefSize(555.0, 292.0); textareaa.setLayoutX(25.0); textareaa.setLayoutY(205);
		 
		Button but21 = new Button("Check");
		but21.setLayoutX(491.0); but21.setLayoutY(510); but21.setPrefSize(85.0, 37.0);
		 
		TextArea textareab = new TextArea();
		textareab.setPrefSize(550.0, 37.0); textareab.setLayoutX(25.0); textareab.setLayoutY(551.0);
		
		but21.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event){
				int pn = 1;
		        int num = pn;

		        StringBuffer sb = new StringBuffer("import java.util.*;public class CoffeeBean {    static int questionNum = 0;    public static void main(String[] args) {        int[] q1 = {3, 4, 6, 7};        int q2 = 46050;        String q3 = \"airkw\";        String[] q4 = {\"dog\", \"cat\", \"burger\", \"love\", \"life\"};        int[] q5 = {4, 1, 5, 7, 8};        int[] q6 = {4, 1, 5, 7, 8};        String q7 = \"hams3te4r\";        String q8 = \"birthday\";        Character q88 = 'r';        String q9 = \"mammoth\";        int[] q10 = {3, 4, 6, 7};        HashMap<Integer, String> q11 = new HashMap<Integer, String>();        q11.put(4, \"Titan\");        q11.put(6, \"Hacks\");        q11.put(10, \"is\");        q11.put(1, \"Rad\");        int[] q111 = {1, 4, 6, 4};        int[][] q12 = {{4, 56, 12}, {12, 10, 3}};        int seconds = 4838;        String[][] q14 = {{\"Blank\", \"Blank\", \"Blank\", \"Spots\"}, {\"Blank\", \"spots\", \"spots\", \"spots\"}};        int a = 5;        int b = 3;        int c = 7;              }                                                                                                           }\n");
		        sb.replace(73,74, String.valueOf(num));
		        String textBox = textareaa.getText();
		        textBox = textBox.replace("\n", "");
		        textBox = textBox.replace("\t", "");
		        sb.insert(1047, textBox);

		        switch(num) {
		            case 1:
		                sb.insert(943, "findprime(q1);");
		                break;
		            case 2:
		                sb.insert(943, "removethezeros(q2);");
		                break;
		            case 3:
		                sb.insert(943, "System.out.print(getalphabetized(q3));");
		                break;
		            case 4:
		                sb.insert(943, "alphabetize(q4);");
		                break;
		            case 5:
		                sb.insert(943, "highestnum(q5);");
		                break;
		            case 6:
		                sb.insert(943, "lowestnum(q6);");
		                break;
		            case 7:
		                sb.insert(943, "removeNumbers(q7);");
		                break;
		            case 8:
		                sb.insert(943, "replaceLetter(q8, q88);");
		                break;
		            case 9:
		                sb.insert(943, "removeVowels(q9);");
		                break;
		            case 10:
		                sb.insert(943, "System.out.print(Array.toString(removeOddNums(q10)));");
		                break;
		            case 11:
		                sb.insert(943, "System.out.print(getHighkeyLowValue(q11, q111));");
		                break;
		            case 12:
		                sb.insert(943, "System.out.print(getGreater10(q12));");
		                break;
		            case 13:
		                sb.insert(943, "System.out.print(getHours(seconds));");
		                break;
		            case 14:
		                sb.insert(943, "System.out.print(getSpots(q14));");
		                break;
		            case 15:
		                sb.insert(943, "QuadraticEq(a,b,c);");
		                break;
		        }

		        File inner = new File("output.txt");
		        Scanner input;

				  PrintWriter writerr;
				try {
					writerr = new PrintWriter(inner);
			        writerr.println(" ");
			        writerr.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		        
		        try {
					File file = new File("CoffeeBean.java");
					file.createNewFile();
					FileWriter writer = new FileWriter(file);
					writer.write(String.valueOf(sb));
					writer.close();
			        Runtime.getRuntime().exec("cmd /c start cmd.exe /K Runner.bat");
		        }catch(Exception e) {
		        	e.printStackTrace();
		        }
				try {

					input = new Scanner(inner);
					String key = input.nextLine();
					  switch(num) {
			            case 1: if (key.equals("7 3")) {
			                        textareab.setText("You succeeded!");
			                        pts++;
			                    }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 2: if (key.equals("465")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 3: if (key.equals("aikrw")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 4: if (key.equals("burger cat dog life love")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 5: if (key.equals("8")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 6: if (key.equals("1")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 7: if (key.equals("hamster")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 8: if (key.equals("bibthday")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 9: if (key.equals("mmmth")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 10: if (key.equals("[4, 6]")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 11: if (key.equals("a")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 12: if (key.equals("b")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 13: if (key.equals("c")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 14: if (key.equals("d")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			            case 15: if (key.equals("e")){
			            	textareab.setText("You succeeded!");
			                pts++;
			            }
			                    else
			                    	textareab.setText("The code did not work as intended. Please try again.");
			                    break;
			        }

				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
			}
		});

		pane.getChildren().addAll( rect, labeld, labelf, labelg, but4, but3, but2);
		pane.getChildren().add(bar);
		pane.getChildren().addAll(labelk, textareaa, but21, textareab);
		
		return scene;
	}
}

