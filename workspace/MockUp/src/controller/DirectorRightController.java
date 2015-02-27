package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * 
 * @author May Workman
 *
 */

public class DirectorRightController implements Initializable{

		@FXML
		RadioButton  rdoAccepte;
		@FXML
		RadioButton rdoRefuse;
		@FXML
		RadioButton rdoListe;
		@FXML
		Label lblCountAccepte;
		@FXML
		Label lblCountRefuse;
		@FXML
		Label lblCountListe;
		@FXML
		Label lblCountTotale;
		

		
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
		

		
	
}