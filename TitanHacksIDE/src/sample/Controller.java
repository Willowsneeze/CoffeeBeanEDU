package sample;

import java.io.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
import javafx.stage.Stage;

public class Controller {

    int pts;
    String user;
    int pic;
    int ln;
   double level;

    HashMap<Integer, String> basicsC = new HashMap<Integer, String>();
    HashMap<Integer, String> basicsE = new HashMap<Integer, String>();


    public Scene basics() throws Exception {
        pts = 0;
        user = "Programmer";
        pic = 0;
        ln = 0;
        
        
        
        basicsC.put(0, "Congratulations on beginning on the path to learning Java! Java is a programming language that has been fundamental in the field of computer science for many years. In fact, it is used on billions of machines worldwide!");
        basicsC.put(1, "Java is written as a series of statements. \nEach statement ends with a semicolon ;");
        basicsC.put(2, "Structures such as loops, methods, and classes which encompass statements do so using curly brackets { }");
        basicsC.put(3, "Comments are anything not to be considered code. A whole line is made a comment using two forward slashes //");

        basicsE.put(0, "Computers and phones run on Java. \n" + "So do many games and programs.");
        basicsE.put(1, "int x = 9; \n" + "System.out.println(str);");
        basicsE.put(2, "public static void main(String[] args) { \n" + "\n" + "}");
        basicsE.put(3, "// this program was written for TitanHacks.");
        
        basicsC.put(0, "Congratulations on beginning on the path to learning Java! Java is a programming language that has been fundamental in the field of computer science for many years. In fact, it is used on billions of machines worldwide!");
        basicsC.put(1, "Java is written as a series of statements. Each statement ends with a semicolon ;");
        basicsC.put(2, "Structures such as loops, methods, and classes which encompass statements do so using curly brackets { }");
        basicsC.put(3, "Comments are anything not to be considered code. A line is made a comment using two forward slashes //");
 
        basicsC.put(4, "Variables, like in algebra, are symbols that represent another value. In Java, a variable is a letter or series of letters that can hold values of a certain data type. As such, there are a few different types of variable:");
        basicsC.put(5, "Integers (int) can hold any positive or negative number up to about +-2 trillion.");
        basicsC.put(6, "Doubles (double) can hold every number integers can, but can also hold decimals up to fifteen floating points.");
        basicsC.put(7, "Booleans (boolean) can hold either true or false.");
        basicsC.put(8, "Characters (char) can hold any one character. They are enclosed in single quotes.");
        basicsC.put(9, "Strings (String) can hold any number of characters. They are enclosed in double quotes.");
        basicsC.put(10, "Variables are declared by writing their type and name in a statement. The name can be anything except for a few reserved keywords! (By convention, variable names start with lowercase)");
        basicsC.put(11, "Variables are then initialized with a value using the assignment operator =. HOWEVER, they must be declared before they can be given a value!");
        basicsC.put(12, "These two steps can be combined into a single step as so:");
 
        basicsC.put(13, "Variables can hold a value, but the value of the variable can be manipulated in various ways.");
        basicsC.put(14, "Unary operators in Java require only a single value to work:\n" + "The increment operator ++ adds one to the value\n" + "The decrement operator -- subtracts one from the value");
        basicsC.put(15, "Binary opators in Java require two values to work:\n" + "The addition operator + adds one value to another:\n" + "The subtraction operator - removes one avlue from another:\n" + "The division operator / divides one value by another:\n" + "The multiplication operator * multiplies one value by another:\n" + "The modulus operator % returns the remainder of division:\n" );
        basicsC.put(16, "If an operation involves both using and subsequently changing the value of a variable,  a combined assignment operator can be used as shorthand. These are +=, -=, /=, *=, and %=");
 
        basicsC.put(17, "Most Java programs are made of multiple classes. A class is a Java file, and is a page containing methods. Methods are sections of code that perform certain functions.");
        basicsC.put(18, "Classes and methods are declared as follows. They are influenced by keywords such as public and static, which perform functions outside the scope of this introductory course. By convention, class names are capitalized. They MUST be the same as the file name. Method names are by convention lowercase.");
        basicsC.put(19, "The main method is the only one run automatically. Other methods must be called, as follows:");
        basicsC.put(20, "If a method requires a value, it can input one as a parameter. Below is a method with an int as a parameter, and a call to this method.");
        basicsC.put(21, "Some methods, such as println, can be called from external classes that come with the Java API.");
        basicsC.put(22, "An object is simply an instance of a class. An object can be constucted as follows:");
 
        basicsC.put(23, "Relational operators determine relationships between values by comparison. They will return a boolean value (true or false). They are: greater than (>), less than (<), greater than or equal to (>=), less than or equal to (<=), equal to (==), not equal to (!=)");
        basicsC.put(24, "Logical operators combine these relational operators.\n" + "They are AND (&&) // returns true if both relationships are true\n" + "                 OR (||) // returns true if one or both relationships are true\n" + "                 XOR (^) // returns true only if one relationship is true\n" + "                 NOT (!) // returns the opposite value (i.e., true if the relationship is false)");
        basicsC.put(25, "Relational and logical operators do not make sense on their own, unless they are implented in a larger structure that utilizes them");
        basicsC.put(26, "An if statement will perform a function if a condition is met.");
        basicsC.put(27, "An if/else statement will perform one function if a condition is met, and another if it isn't.");
        basicsC.put(28, "A while loop will perform a function as long as a condition is met. (Be careful as not to enter an infinite loop! This is done by making sure the value being compared is changing within the while loop)");
        basicsC.put(29, "for loops will perform a function a certain amount of times. Within a for loop, a control variable is initialized, it is compared, and then updated.");
       
        basicsC.put(30, "To use arrays, we must first import the java.util class into Java. To do this, we write the following statement above the class header:");
        basicsC.put(31, "An array is an Object (not a variable!) that is a list of items, such as ints, doubles, Strings, etc. It can only hold items of one data type, which is stated during the declaration. An array is declared like any other Object, except it is given an unchangeable length:");
        basicsC.put(32, "The items stored in an array are referenced by the name of the array and their index (position) within the array. Note that indexes start at 0, not 1!");
        basicsC.put(33, "Arrays start out with default values of 0 for ints, 0.0 for doubles, false for booleans, and null for Strings. These values change as they are assigned, or can be initialized during decleration as so:");
        basicsC.put(34, "The number of items within an array is given by .length. Note that this is a property, not a method, of the array.");
       
        basicsC.put(35, "ArrayLists are Objects similar to Arrays, except they are much more flexible, unlike arrays, which have rigid lengths and positions.");
        basicsC.put(36, "ArrayLists are declared similarly to Arrays, but with a few differences:\n" + "    - ArrayLists do not contain primitive types like ints, instead using their Object counterparts like Integer\n" + "    - ArrayLists, of course, are not declared with a particular length, and start off with no indexes at all");
        basicsC.put(37, "Methods must be used to interact with ArrayLists.");
        basicsC.put(38, "get(index) returns the value stored at that index");
        basicsC.put(39, "add(value) adds a value to the end index of the ArrayList; add(index, value) adds a value to a particular index, shifting all subsequent values one index forward.");
        basicsC.put(40, "remove(index) removes a value, shifting all subsequent values one index backwards.");
        basicsC.put(41, "size() returns the number of values in the ArrayList, similar to the length property of arrays.");
       
        basicsC.put(42, "Hashmaps are like ArrayLists, as they are lists of Objects. The difference is, they match one value (the key) to another (the value).");
        basicsC.put(43, "Declaring hashmaps is similar to ArrayLists, except two types are indicated. The first is the key; the second the value.");
        basicsC.put(44, "Hashmaps have their own set of methods.");
        basicsC.put(45, "get(key) returns the value stored for that key.");
        basicsC.put(46, "put(key, value) adds a key-value pair to the hashmap.");
        basicsC.put(47, "remove(key) removes a key and its corresponding value.");
        basicsC.put(48, "size() returns the number of pairs in the hashmap.");
       
        basicsC.put(49, "This concludes this introductory course on the Java language. Much more awaits; explore and conquer!");
 
        basicsE.put(0, "Computers and phones run on Java. \n" + "So do many games and programs.");
        basicsE.put(1, "int x = 9; \n" + "System.out.println(str);");
        basicsE.put(2, "public static void main(String[] args) { \n" + "\n" + "}");
        basicsE.put(3, "// this program was written for TitanHacks.");
 
        basicsE.put(4, " ");
        basicsE.put(5, "7, 94000, -122");
        basicsE.put(6, "7, 94000.45, -122.0000");
        basicsE.put(7, "true, false");
        basicsE.put(8, "\'a\', \'A\', \'1\'");
        basicsE.put(9, "\"I like apples\", \"Lorem ipsum sit dolar amet\", \"97gukgasdf76f\"");
        basicsE.put(10, "int apple;\n" + "boolean robert;\n" + "String titan;");
        basicsE.put(11, "apple = 42;\n" + "robert = true;\n" + "titan = \"Hackathon\";");
        basicsE.put(12, "int apple = 42;\n" + "boolean robert = true;\n" + "String titan = \"Hackathon\";");
 
        basicsE.put(13, " ");
        basicsE.put(14, "int x = 5;\n" + "x++; // x is now 6\n" + "double y = 4.2;\n" + "y--; // y is now 3.2");
        basicsE.put(15, "int x = 4 + 6; // x has a value of 10\n" + "int x = 30 - 21; // x has a value of 9\n" + "int x = 14 / 7; // x has a value of 2\n" + "int x = 3 * 4; // x has a value of 12\n" + "int x = 10 % 6; // x has a value of 4");
        basicsE.put(16, "x = x + y;\n" + "x += y; // This will add y to x and assign the value to x. It is equivalent to the previous statement. ");
 
        basicsE.put(17, " ");
        basicsE.put(18, "// This is a class Main with a main method inside\n" + "public class Main {\n" + "    public static void main(String[] args) {\n" + "    }\n" + "}");
        basicsE.put(19, "method();");
        basicsE.put(20, "public static void methodName(int num) {\n" + "}\n" + "...\n" + "methodNum(5);");
        basicsE.put(21, "System.out.println(\"Hello World!\")");
        basicsE.put(22, "Object objectName = new Object();");
 
        basicsE.put(23, "int x = 6;\n" + "int y = 9;\n" + "x > y // false\n" + "x < y // true");
        basicsE.put(24, "double x = 3;\n" + "double y = 8;\n" + "(x < y) && (y == 8) // false\n" + "(x < y) || (y == 8) // true");
        basicsE.put(25, " ");
        basicsE.put(26, "int x = 7;\n" + " if (x < 3) {  // Will execute if x is less than 3\n" + "   x++; // Will not execute\n" + "}");
        basicsE.put(27, "int x = 7;\n" + "if (x < 3) { \n" + "  x++; // Will not execute\n" + "} else\n" + "x--; // Will execute");
        basicsE.put(28, "int x = 10;\n" + "while (x > 5) { // while x is greater than 5, loop will run\n" + "  x--; // Will execute 5 times\n" + "}");
        basicsE.put(29, "for (int i = 0; i < 3; i++) {\n" + "  System.out.print(i); // Will execute 3 times\n" + "}");
       
        basicsE.put(30, "import java.util.*; \n" + "// This imports everything from java.util, including arrays and arrayLists");
        basicsE.put(31, "int[] name = new int[len]; // Makes an int array of ints with length len");
        basicsE.put(32, "Ex. name[0] would reference the first int value stored in int[] name");
        basicsE.put(33, "int[] name = {1, 2, 3, 4} // Makes an int array of length 4 containing four values");
        basicsE.put(34, "name.length == 4 // int[] name has four items");
       
        basicsE.put(35, " ");
        basicsE.put(36, "ArrayList<Integer> list = new ArrayList<Integer>(): // Makes an ArrayList of Integers called list");
        basicsE.put(37, " ");
        basicsE.put(38, "list.get(0) will reference the first value");
        basicsE.put(39, "list.add(10) will add the value 10 to the end of the ArrayList\n" + "list.add(0, 10) will add the value 10 to the first index of the ArrayList, shifting all subsequent values one index forward");
        basicsE.put(40, "list.remove(0) will remove the first index of the ArrayList, shifting all subsequent values one index back");
        basicsE.put(41, "list.size() == 1 // There is one value stored in ArrayList list");
       
        basicsE.put(42, " ");
        basicsE.put(43, "HashMap<Integer, String> mappy = new HashMap<Integer, Strings>();\n" + "// Creates a hashmap mappy, in which are stored pairs of Integers matched to Strings");
        basicsE.put(44, " ");
        basicsE.put(45, "mappy.get(0) // Returns the String value associated with the Integer key 0");
        basicsE.put(46, "mappy.put(5, \"apples\" // Adds a key pair to the Hashmap mappy");
        basicsE.put(47, "mappy.remove(3) // Removes the key pair associated with the key 3");
        basicsE.put(48, "mappy.size() == 3 // There are three key pairs stored in Hashmap mappy");
       
        basicsE.put(49, "Made for the TitanHacks Hackathon 2020 :)");
        
        level = (double)1/(basicsC.size()-1);
        Pane root = new Pane();
        Scene basics1 = new Scene(root, 600, 600);
        
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
        
        Button but3 = new Button("<");
        but3.setLayoutX(522); but3.setLayoutY(8);
        
        Button but2 = new Button(">");
        but2.setLayoutX(548); but2.setLayoutY(8);
        
        ProgressBar bar = new ProgressBar();
        bar.setLayoutX(247); bar.setLayoutY(42); bar.setPrefSize(300, 20); bar.setProgress(0);
        
        Label labelc = new Label("Examples:");
        labelc.setPrefHeight(30.0); labelc.setPrefWidth(150.0); labelc.setLayoutX(20.0); labelc.setLayoutY(330.0);
        labelc.setFont(new Font("Consolas Bold", 24));
        
        Label labeld = new Label("Concepts:");
        labeld.setPrefHeight(30.0); labeld.setPrefWidth(150.0); labeld.setLayoutX(20.0); labeld.setLayoutY(112.0);
        labeld.setFont(new Font("Consolas Bold", 24));
        
        Label labelf = new Label("Programmer");
        labelf.setLayoutX(79.0); labelf.setLayoutY(13.0);
        labelf.setFont(new Font("Consolas Bold", 24));
        
        Label labelg = new Label("x Pts.");
        labelg.setPrefHeight(22.0); labelg.setPrefWidth(132.0); labelg.setLayoutX(79.0); labelg.setLayoutY(41.0);
        labelg.setFont(new Font("Consolas Bold", 18));
        
        TextArea field1 = new TextArea();
        field1.setPrefSize(560, 174); field1.setLayoutX(20); field1.setLayoutY(149); field1.setEditable(false); field1.setWrapText(true);
        
        Separator sep = new Separator();
        sep.setPrefSize(550, 0); sep.setLayoutX(25); sep.setLayoutY(329); 
        
        TextArea field2 = new TextArea();
        field2.setPrefSize(560, 220); field2.setLayoutX(22); field2.setLayoutY(366); field2.setEditable(false); field2.setWrapText(true);
        field1.setText(basicsC.get(ln));
        field2.setText(basicsE.get(ln));

        but3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
                ln--;
                if(ln >= 0) {
                	bar.setProgress(level*ln);
                	field1.setText(basicsC.get(ln));
                	field2.setText(basicsE.get(ln));
                }else {
                	ln++;
                }
			}
        });
        
        but2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ln++;
            	if(ln < basicsC.size()){
            		bar.setProgress(level*ln);
            		field1.setText(basicsC.get(ln));
            		field2.setText(basicsE.get(ln));
            	}else {
            		ln--;
            	}
            }
        });
        root.getChildren().addAll( rect, field1, field2, sep, labelc, labeld, labelf, labelg, but3, but2, bar, but4);
        return basics1;
    }

    public void makeSave(ActionEvent save, int lvl) throws IOException {
        File savefile = new File("/resources/coffeebeansaves.txt");
        savefile.createNewFile();
        PrintWriter writer = new PrintWriter("coffeebeansaves.txt");
        writer.println(ln);
        writer.println(pts);
        writer.close();
    }
    public void readSave(ActionEvent load) throws IOException {

    }
}
