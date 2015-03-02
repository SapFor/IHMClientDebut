package controller;

import javafx.fxml.FXML;
import controller.DirectorRightController;
import controller.DirectorLeftController;


public class DirectorController {

//	@FXML private Button btnDirector1;
//	@FXML private Label lblDirector1;
	
	@FXML DirectorLeftController directorLeftController;
	@FXML DirectorRightController directorRightController;
	
	@FXML public void initialize() {
		directorLeftController.init(this);
	}
	
	public void loadTokenFromLeft(String token) {
		directorRightController.getSessionToken(token);
	}
	



}
