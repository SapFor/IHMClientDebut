package controller; 
import java.net.URL;
import java.util.ResourceBundle;

import model.LectureUVFichier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
//import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;
//import javafx.scene.control.TextArea;
import controller.DirectorController;

public class DirectorLeftController implements Initializable{
	
	private DirectorController director;
	

	    @FXML
	    private ListView<String> listUV;
	    
   
	   /*public void btnTestClicked(ActionEvent event) {
	    	// send chosen Session Token to DirectorRightCotroller
	    	// this will not normally be a button!!
	    	director.loadTokenFromLeft(lblTest.getText()); //this loadTokenFromLeft will probably need to be changed but still needs to be implemented.
	    } */
	    
	    
// end May's test code - can be deleted later
	    
	    // allows DirectorLeftController to pass information to DirectorRightController using DirectorController
	    
	  /* public void OnClickSession (ActionEvent event) {
	    	director.loadTokenFromLeft(((listUV).getText());
	    }*/
	    
	    
	    public void init(DirectorController directorController) {
			director = directorController;
		}
	    
  
	     // JC: initialisation de la Liste au chargement de la page
	    
	    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
	    assert listUV != null : "fx:id=\"listUV\" was not injected: check your FXML file 'Director-left.fxml'.";
	    LectureUVFichier fichierUV = new LectureUVFichier("ressources/UVname", 0);
    	ObservableList<String> items =FXCollections.observableArrayList (fichierUV.getListUV());
    	listUV.setItems(items);
    	//System.out.println("passe par la");
	    }
}
	    
	    
/*	    @FXML
	   void OnClicSession(Event event) {
	    	String items =sessionArea.getSelectionModel().getSelectedItem();
	    	
	    	StringTokenizer lst = new StringTokenizer(items);
	    	String mot = lst.nextToken();
	    	LectureUVFichier fichierInfo = new LectureUVFichier("ressources/Info"+ mot, 0);
	    	String info = fichierInfo.getDescription();
	    	infoArea.setText(info);}
	      
	  		
}*/
	
	
	

