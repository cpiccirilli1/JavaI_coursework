/**
* Class: CIST 2371 Introduction to Java
* Semester: Fall 2018
* Instructor: Stevie Prettyman
* Description: Solution to Unit 08 Program 1 
* Due: 12/2/2018
* @author Chelsea Piccirilli
* @version 1.0
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*
*/

import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.control.TextArea;


public class Unit08_Prog1 extends Application{
	
	@Override
	public void start(Stage primaryStage){
				
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("Unit08_Prog1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	protected BorderPane getPane(){
		HBox paneForButtons = new HBox(20);
		Button btLeft = new Button("<=");
		Button btRight = new Button("=>");
		paneForButtons.getChildren().addAll(btLeft, btRight);
		paneForButtons.setAlignment(Pos.CENTER);
		
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);

		TextArea taNote = new TextArea("Programming is fun!");
		taNote.setPrefColumnCount(30);
		taNote.setPrefRowCount(7);
		taNote.setWrapText(true);

		Pane txtArea = new Pane();
		txtArea.getChildren().add(taNote);
		pane.setCenter(txtArea);

		
		ToggleGroup colors = new ToggleGroup();

		RadioButton red = new RadioButton("Red");
		red.setTextFill(Color.RED);
		red.setPadding(new Insets(5, 5, 5, 0));
		red.setToggleGroup(colors);

		RadioButton yellow = new RadioButton("Yellow");
		yellow.setTextFill(Color.YELLOW);
		yellow.setPadding(new Insets(5, 5, 5, 0));
		yellow.setToggleGroup(colors);

		RadioButton white = new RadioButton("White");
		white.setSelected(true);
		white.setTextFill(Color.WHITE);
		white.setPadding(new Insets(5, 5, 5, 0));
		white.setToggleGroup(colors);

		RadioButton orange = new RadioButton("Orange");
		orange.setTextFill(Color.ORANGE);
		orange.setPadding(new Insets(5, 5, 5, 0));
		orange.setToggleGroup(colors);

		RadioButton green = new RadioButton("Green");
		green.setTextFill(Color.GREEN);
		green.setPadding(new Insets(5, 5, 5, 0));
		green.setToggleGroup(colors);


		HBox topHBox = new HBox();
		topHBox.getChildren().addAll(red, yellow, white, orange, green);
		topHBox.setAlignment(Pos.CENTER);
		pane.setTop(topHBox);

		btLeft.setOnAction(e -> taNote.setStyle("-fx-background-color: red"));
		btRight.setOnAction();
		return pane;
	}
}
	