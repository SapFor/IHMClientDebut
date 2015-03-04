package controller;

import java.util.Iterator;

import model.LectureUVFichier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;


/**
 * 
 * @author May Workman
 *
 */

public class DirectorRightController {

	//private DirectorController director;
	private String sessionToken;
	private DirectorController director;
	
/*	@FXML
    private Label nom;
	
	@FXML
    private Label prenom;
	
	@FXML
    private ListView<String> listNom;
	
	@FXML
    private ListView<Pane> listRadio;*/
	
	@FXML
    private GridPane gridCandidats;
	
/*	@FXML
    private ToggleGroup radioGroup;
	
	@FXML
    private RadioButton rdoAttente;
	
	@FXML
    private RadioButton rdoRefuse;
	
	@FXML
    private RadioButton rdoAccepte;
*/	
		
				
/*	public void init(DirectorController directorController) {
		director = directorController;
	}
	
	public void getSessionToken(String token){
		sessionToken = token;
	}*/

	public void loadCandidats(ObservableList<String> token) {
		//gridCandidats.setPadding(new Insets(100, 100, 100, 100));
		//gridCandidats.setMargin(node, new Insets(50, 10, 5, 10));
		loadGrid(token);
		
		
		
	//	gridCandidats.addrow();
    //	listNom.setItems(token);
    	
    	
    	
 //   	ObservableList<Pane> myRadioBtnList = FXCollections.observableArrayList (paneRadio);
 //   	myRadioBtnList.add(paneRadio);
 //   	paneRadio.setVisible(true);
    	
  // 		makeRadioButtonsPane(token.size());
  // 			myRadioBtnList.add(paneRadio);
  //  		paneRadio.setVisible(true);

    	//listRadio.setItems(myRadioBtnList);

    }

    
    
	public void init(DirectorController directorController) {
		director = directorController;
	}
		
	
	private void loadGrid(ObservableList<String> names) {
		Iterator<String> iter = names.iterator();
		int i=1;
		while (iter.hasNext()){
			RadioButton rdoAttente = new RadioButton(); 
			RadioButton rdoRefuse = new RadioButton(); 
			RadioButton rdoAccepte = new RadioButton(); 
			ToggleGroup radioGroup = new ToggleGroup();
			rdoAttente.setToggleGroup(radioGroup);
			rdoRefuse.setToggleGroup(radioGroup);
			rdoAccepte.setToggleGroup(radioGroup);
			rdoAttente.setVisible(true);
			rdoRefuse.setVisible(true);
			rdoAccepte.setVisible(true);
			
			HBox hb = new HBox(rdoAttente, rdoRefuse, rdoAccepte);
			hb.setSpacing(100);
			hb.setPadding(new Insets(10, 10, 10, 10));
			Label lblName = new Label();
			lblName.setText(iter.next());
			gridCandidats.add(lblName, 0, i);
			gridCandidats.add(hb,1,i);
			
			i++;
		}
	}
}



		
