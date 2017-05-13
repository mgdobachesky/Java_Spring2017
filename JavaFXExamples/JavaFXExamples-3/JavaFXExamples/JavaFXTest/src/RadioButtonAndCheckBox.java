import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class RadioButtonAndCheckBox extends Application{

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
		primaryStage.setTitle("CheckBox, Radio Button, and FlowPane");
		
		FlowPane grid = new FlowPane();
		grid.setAlignment(Pos.CENTER);
		
		
		Text scenetitle = new Text("Check Box and Radio Buttons");	
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.getChildren().add(scenetitle);
		
		final Text actiontarget = new Text();
		grid.getChildren().add(actiontarget);
	
		//A checkbox without a caption
		final CheckBox cb1 = new CheckBox();
		//A checkbox with a string caption
		final CheckBox cb2 = new CheckBox("Second");
		
		cb1.setAllowIndeterminate(true);
		cb1.setIndeterminate(true);

		cb1.setText("First");
		cb2.setSelected(true);
		grid.getChildren().add(cb1);
		grid.getChildren().add(cb2);		

		//A radio button with an empty string for its label
		RadioButton rb1 = new RadioButton();
		//Setting a text label
		rb1.setText("First RB");
		//A radio button with the specified label
		RadioButton rb2 = new RadioButton("Second RB");
		RadioButton rb3 = new RadioButton("One Group");
		
		final ToggleGroup firstRBGroup = new ToggleGroup();
		rb1.setToggleGroup(firstRBGroup);
		rb2.setToggleGroup(firstRBGroup);
		
		rb1.setSelected(true);
		
		// note, the group doesn't get added to the grid
		grid.getChildren().add(rb1);
		grid.getChildren().add(rb2);
		grid.getChildren().add(rb3);
		
		// make this a final variable so the event handler
		// can see it (or declare it as a class variable)
		
		
		EventHandler eh = new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        if (event.getSource() instanceof CheckBox) {
		            CheckBox chk = (CheckBox) event.getSource();	            
		            if ("First".equals(chk.getText())) {
		               actiontarget.setText("First checkbox selected");
		            } else if ("Second".equals(chk.getText())) {
		                actiontarget.setText("Second checkbox selected");
		            }
		        }
		        
		        if (event.getSource() instanceof RadioButton){
		        	RadioButton rb = (RadioButton) event.getSource();
		        	actiontarget.setText("Radio button " + rb.getText() + " pressed");
		        }
		       
		    };
		};
	

		
		cb1.setOnAction(eh);
		cb2.setOnAction(eh);
		rb1.setOnAction(eh);
		rb2.setOnAction(eh);
		rb3.setOnAction(eh);
		Scene scene = new Scene(grid,300,275);
		primaryStage.setScene(scene);
		primaryStage.show();	
	}

}
