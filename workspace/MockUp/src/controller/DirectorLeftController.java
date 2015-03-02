package controller; 

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.ListView;
//import javafx.scene.control.TextArea;
import controller.DirectorController;

public class DirectorLeftController {
	
	private DirectorController director;
	
/*	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ListView<String> listUV;
	    
	    @FXML
	    private ListView<String> sessionArea;
	    
	    @FXML
	    private TextArea infoArea;
*/	    
// Test button and label so May can work on Right Controller
	    @FXML
	    private Button btnTest;
	    
	    @FXML
	    private Label lblTest;
	    
	    public void btnTestClicked(ActionEvent event) {
	    	// send chosen Session Token to DirectorRightCotroller
	    	// this will not normally be a button!!
	    	director.loadTokenFromLeft(lblTest.getText()); //this loadTokenFromLeft will probably need to be changed but still needs to be implemented.
	    } 
// end May's test code - can be deleted later
	    
	    // allows DirectorLeftController to pass information to DirectorRightController using DirectorController
	    public void init(DirectorController directorController) {
			director = directorController;
		}
	    

	    
	    
/*	    @FXML
	   void OnClicSession(Event event) {
	    	String items =sessionArea.getSelectionModel().getSelectedItem();
	    	
	    	StringTokenizer lst = new StringTokenizer(items);
	    	String mot = lst.nextToken();
	    	LectureUVFichier fichierInfo = new LectureUVFichier("ressources/Info"+ mot, 0);
	    	String info = fichierInfo.getDescription();
	    	infoArea.setText(info);}
	    
	    
	    @FXML          	    
	    void initialize() {
	    assert listUV != null : "fx:id=\"listUV\" was not injected: check your FXML file 'Director-left.fxml'.";

	    }
*/
		
}
	
	
	

