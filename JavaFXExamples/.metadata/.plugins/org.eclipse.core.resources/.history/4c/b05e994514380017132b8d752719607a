

import java.io.File;
import java.util.List;

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
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class FileChooserExample  extends Application {
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
	public void start(final Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("JavaFX Welcome");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text scenetitle = new Text("File Examples");	
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		// column span is 2, row span is 1
		grid.add(scenetitle, 0, 0, 1, 1);

		
		
		Button btn = new Button("Show File Choosers");
		// using the HBox layout so you can align the
		// button on the right, independent of the gri
		// control's alignment
		
		grid.add(btn, 0, 1);
		grid.setGridLinesVisible(true);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		    	FileChooser fileChooser = new FileChooser();
		    	fileChooser.setTitle("Open Resource File");
		    	fileChooser.setInitialDirectory( new File("c:\\temp"));
		    	fileChooser.getExtensionFilters().addAll(
		                 new FileChooser.ExtensionFilter("All files", "*.*"),
		                 new FileChooser.ExtensionFilter("Text Files", "*.txt"),
		                 new FileChooser.ExtensionFilter("Java Files", "*.java")
		             );
		    	File userFile = fileChooser.showOpenDialog(primaryStage);
		    	if (userFile != null) {
                   // open the file
                }
		    	
		    	fileChooser.setTitle("Multiple Files");
		    	List<File> userListOfFiles = fileChooser.showOpenMultipleDialog(primaryStage);
		        File saveFile = fileChooser.showSaveDialog(primaryStage);
		    }
		});
		Scene scene = new Scene(grid,300,275);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
