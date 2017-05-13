import java.util.List;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ChoiceBoxExample extends Application{

		/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Choice Box Example");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		
		
		// make this a final variable so the event handler
		// can see it (or declare it as a class variable)
		final Text actiontarget = new Text();
		actiontarget.setText("The Selection Results");
        grid.add(actiontarget, 0, 2);        	
		
		ChoiceBox choices = new ChoiceBox();
		ChoiceBox cb2 = new ChoiceBox(FXCollections.observableArrayList(
				"First","Second","Third"));
		
	
		choices.setItems(FXCollections.observableArrayList("Apple", "Banana", "Orange", "Peach", "Pear", "Strawberry"));
		choices.setValue("Apple");
		cb2.setValue("First");
		grid.add(choices, 0, 1);
		grid.add(cb2,1,1);
	 
		final List options = choices.getItems();
		choices.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener() {
		       public void changed(ObservableValue ov, Object oldSelected, Object newSelected) {
		            String output = "Old Selected Option - " + options.get((int)oldSelected) + " " +
		            		"New Selected Option - " + options.get((int)newSelected);		            
		            actiontarget.setText(output);
		        }

			  
		    });
		Scene scene = new Scene(grid,300,275);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}

}
