package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ExampleForm implements javafx.fxml.Initializable{
	@FXML 	private TextField txtData;
	@FXML	private Button btnPrint;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		btnPrint.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent e) {
		    	txtData.setText("Hello!");
		    }

			

			
		});	
	}

}
