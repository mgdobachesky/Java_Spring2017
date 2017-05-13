
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.GroupBuilder;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFieldBuilder;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.HBoxBuilder;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class bindingTextBoxExample extends Application {
	StringProperty title = new SimpleStringProperty();

	@Override
	public void start(Stage primaryStage) {

		
	primaryStage.setTitle("JavaFX Welcome");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text scenetitle = new Text("Welcome");	
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		// column span is 2, row span is 1
		grid.add(scenetitle, 0, 0, 2, 1);		

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		userTextField.setText("Change This Text");
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
		grid.setGridLinesVisible(true);
		
		
	
		    title.bind(userTextField.textProperty());
			Scene scene = new Scene(grid,300,275);
		    primaryStage.setScene(scene);
		    primaryStage.titleProperty().bind(title);


		    primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}