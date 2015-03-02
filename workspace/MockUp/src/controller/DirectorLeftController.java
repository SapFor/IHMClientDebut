package controller;
import java.net.URL;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import model.LectureUVFichier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;



public class DirectorLeftController {
	
	   @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ListView<String> listUV;
	    
	    @FXML
	    private ListView<String> sessionArea;
	    
	    @FXML
	    private TextArea infoArea;
	    
	      
	    	
	    @FXML
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
	}
	
	
	

