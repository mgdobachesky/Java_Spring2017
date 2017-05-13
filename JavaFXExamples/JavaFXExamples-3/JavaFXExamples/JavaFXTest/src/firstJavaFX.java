import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class firstJavaFX extends Application{
Label lb_text;
Button myButton;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		// will get an error if you uncomment out the modality 
		// line because this is the primary stage
		//stage.initModality(Modality.WINDOW_MODAL);
		//stage.initStyle(StageStyle.UTILITY);
		lb_text = new Label("this is the first label");
		myButton = new Button();
		myButton.setText("This is a button");	
		VBox root = new VBox();
		root.getChildren().add(lb_text);
		root.getChildren().add(myButton);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		
		stage.show();
	}

}
