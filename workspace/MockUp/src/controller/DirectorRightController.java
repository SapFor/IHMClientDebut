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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


/**
 * 
 * @author May Workman
 *
 */

public class DirectorRightController {

	private String sessionToken;
	private DirectorController director;
	

	@FXML
    private GridPane gridCandidats;
	

	public void loadCandidats(ObservableList<String> token) {
		loadGrid(token);
    }


	public void init(DirectorController directorController) {
		director = directorController;
	}
		
	
	private void loadGrid(ObservableList<String> names) {

		gridCandidats.getChildren().clear(); // clear gridPane
		
		// setup column titles
		Text txtNameTitle = new Text("Noms des Candidats");
		Text txtAccepteTitle = new Text("Accepté");
		Text txtRefuseTitle = new Text("Refusé");
		Text txtAttenteTitle = new Text("Liste d'Attente");
		HBox hbTitle = new HBox(txtAccepteTitle, txtRefuseTitle, txtAttenteTitle);
		hbTitle.setSpacing(100);
		hbTitle.setPadding(new Insets(10, 10, 10, 10));
		//txtNameTitle.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		gridCandidats.add(txtNameTitle,0,0); // (txtNameTitle, column, row)
		gridCandidats.add(hbTitle,1,0);
		
		Iterator<String> iter = names.iterator();
		int i=10;
		while (iter.hasNext()){
			
			// setup of RadioButtons
			RadioButton rdoAttente = new RadioButton(); 
			RadioButton rdoRefuse = new RadioButton(); 
			RadioButton rdoAccepte = new RadioButton(); 
			
			// only one RadioButton belonging to toggleGroup can be choosen at a given moment 
			ToggleGroup radioGroup = new ToggleGroup();
			rdoAttente.setToggleGroup(radioGroup);
			rdoRefuse.setToggleGroup(radioGroup);
			rdoAccepte.setToggleGroup(radioGroup);
			rdoAttente.setVisible(true);
			rdoRefuse.setVisible(true);
			rdoAccepte.setVisible(true);
			
			// putting RadioButtons into HBox for easy horizontal distribution
			HBox hb = new HBox(rdoAttente, rdoRefuse, rdoAccepte);
			hb.setSpacing(100);
			hb.setPadding(new Insets(10, 10, 10, 10));
			
			Text txtName = new Text();
			txtName.setText(iter.next());
			// adding names and RadioButtons to gridPane
			gridCandidats.add(txtName, 0, i);
			gridCandidats.add(hb,1,i);
			i++;
		}
		
	}
}



		
