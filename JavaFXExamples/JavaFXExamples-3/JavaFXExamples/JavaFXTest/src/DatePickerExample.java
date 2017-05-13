
import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;

public class DatePickerExample extends Application {	
	@Override
	public void start(Stage primaryStage) {
		 final DatePicker datePicker = new DatePicker();
	        datePicker.setOnAction(new EventHandler() {
	 
	            @Override
	            public void handle(Event event) {
	                LocalDate date = datePicker.getValue();
	                System.err.println("Selected date: " + date);
	            }
	 
	        });
	 
	        datePicker.setValue(LocalDate.now());
	        datePicker.setShowWeekNumbers(true);	     

	        
	        StackPane root = new StackPane();
	        root.getChildren().add(datePicker);
	        datePicker.requestFocus();
	 
	        Scene scene = new Scene(root, 300, 250);
	 
	        primaryStage.setTitle("Date Picker Example");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
