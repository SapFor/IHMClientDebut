package view;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

<<<<<<< HEAD
import application.Main;
import model.LectureUVFichier;
=======
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
>>>>>>> origin/Formations
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;

public class MainController implements Initializable{
	
	@FXML
    private Tab formations;
	@FXML
    private Tab Director;
	
	public void initialize(URL arg0, ResourceBundle arg1) {

		
	}
	
<<<<<<< HEAD

=======
	/**
	 * Liste observable de chaine de caracteres (UV)
	 */
	private ObservableList<String> List = FXCollections.observableArrayList();
	
	/**
	 * 
	 */
	
	
	@FXML 
	private void formationTab(){
		
	}
>>>>>>> origin/Formations
}
