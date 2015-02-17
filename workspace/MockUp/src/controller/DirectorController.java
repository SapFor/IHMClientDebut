package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DirectorController implements Initializable{

	@FXML private Button btnDirector1;
	
	@FXML private Label lblDirector1;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	@FXML private void btnDirector1Clicked(ActionEvent event){
		System.out.println("Button Director Clicked");
	}

}
