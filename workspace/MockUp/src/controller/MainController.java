package controller;
import java.net.URL;
import java.util.ResourceBundle;
import model.LectureUVFichier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;

/**
 * FXML Main Controller class
 *
 * 
 */
public class MainController implements Initializable{
	
	@FXML
    private Tab formations;
	@FXML
    private Tab Director;
    @FXML
    private ListView<String> listUV;
    @FXML
    private TextArea descrArea;
    @FXML
    private TextArea infoArea;
    @FXML
    private ListView<String> sessionArea;

	
	
	
    @FXML
    private void OnClickDirector(Event event) {
    	LectureUVFichier fichierUV = new LectureUVFichier("ressources/UVname", 0);
    	ObservableList<String> items =FXCollections.observableArrayList (fichierUV.getListUV());
    	listUV.setItems(items);
    }
	
 	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

			
		
	}

}
