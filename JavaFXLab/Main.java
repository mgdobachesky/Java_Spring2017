package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Candy Bar Exercise");
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid,400,400);
			
			Label lblWeight = new Label("Weight In Pounds: ");
			grid.add(lblWeight, 0, 1);
			TextField txtWeight = new TextField();
			grid.add(txtWeight, 1, 1);
			
			Label lblHeight = new Label("Height In Inches: ");
			grid.add(lblHeight, 0, 2);
			TextField txtHeight = new TextField();
			grid.add(txtHeight, 1, 2);
			
			Label lblYears = new Label("Age In Years: ");
			grid.add(lblYears, 0, 3);
			TextField txtYears = new TextField();
			grid.add(txtYears, 1, 3);
			
			Label lblSex = new Label("Sex: ");
			grid.add(lblSex, 0, 4);
			ToggleGroup grpSex = new ToggleGroup();
			RadioButton rdoMale = new RadioButton("M");
			RadioButton rdoFemale = new RadioButton("F");
			rdoMale.setToggleGroup(grpSex);
			rdoMale.setSelected(true);
			rdoFemale.setToggleGroup(grpSex);
			rdoFemale.setSelected(false);
			HBox hbxSex = new HBox();
			hbxSex.getChildren().add(rdoMale);
			hbxSex.getChildren().add(rdoFemale);
			grid.add(hbxSex, 1, 4);
			
			Label lblActivity = new Label("Activity Level: ");
			grid.add(lblActivity, 0, 5);
			ChoiceBox choActivity = new ChoiceBox(FXCollections.observableArrayList("Sedentary", "Somewhat Active (exercise occasionally)", "Active (exercise 3-4 days per week)", "Highly Active (exercise every day)"));
			grid.add(choActivity, 1, 5);
			choActivity.getSelectionModel().selectFirst();
			
			Button btnCalculateCalories = new Button("Calculate Calories");
			grid.add(btnCalculateCalories, 1, 6);
			
			Label lblResult = new Label("Number Of Chocolate Bars");
			grid.add(lblResult, 1, 7);
			
			Label lblResult2 = new Label("");
			grid.add(lblResult2, 1, 8);
			
			btnCalculateCalories.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					int age;
					int weight;
					int height;
					double calories = 0;
					String maleOrFemale = "";
					String activity = "";
					
					weight = Integer.parseInt(txtWeight.getText());
					height = Integer.parseInt(txtHeight.getText());
					age = Integer.parseInt(txtYears.getText());
					if(rdoMale.isSelected()) {
						maleOrFemale = "male";
					} else if(rdoFemale.isSelected()) {
						maleOrFemale = "female";
					}
					activity = choActivity.getValue().toString();
					
					if(maleOrFemale.equals("male")) {
						calories = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					} else if(maleOrFemale.equals("female")) {
						calories = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
					}
					
					if (activity.equals("Sedentary"))
						calories *= 1.2;
					else if (activity.equals("Somewhat Active (exercise occasionally)"))
						calories *= 1.3;
					else if (activity.equals("Active (exercise 3-4 days per week)"))
						calories *= 1.4;
					else if (activity.equals("Highly Active (exercise every day)"))
						calories *= 1.5;
					
					lblResult2.setText("A " + maleOrFemale + " with those measurements should eat " + (calories / 230) + " \ncandy bars per day to maintain the same weight.");
				}
			});
			
			
			
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
