

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class LoginWithStyleSheet  extends Application {
	// Can define controls in here if you don't want to use the final keyword
	// Text actiontarget = new Text();
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
		primaryStage.setTitle("JavaFX Welcome");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text scenetitle = new Text("Welcome");	
		// This will now be in the stylesheet
		//scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		// column span is 2, row span is 1
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		// make this a final variable so the event handler
		// can see it (or declare it as a class variable)
		final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
		Button btn = new Button("Sign in");
		// using the HBox layout so you can align the
		// button on the right, independent of the gri
		// control's alignment
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);
		//grid.setGridLinesVisible(true);
		
		// for the css
		scenetitle.setId("welcome-text");
		actiontarget.setId("actiontarget");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		    	// This will now be in the stylesheet
		    	//actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Sign in button pressed");
		    }
		});
		Scene scene = new Scene(grid,300,275);
		scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
