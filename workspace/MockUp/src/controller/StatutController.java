package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class StatutController implements Initializable{

	@FXML private Button btnStatut1;
	
	@FXML private Label lblStatut1;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	@FXML private void btnStatut1Clicked(ActionEvent event){
		System.out.println("Button Statut Clicked");
	}
	
	
}
