package controller;

import java.util.Iterator;

import model.LectureUVFichier;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
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
	
	@FXML
    private BorderPane bdrPaneCandidats;

	/*public void loadCandidats(ObservableList<String> token) {
		loadGrid(token);
    }*/
	
	public void loadCandidats(String sessionID) {
		LectureUVFichier fichier = new LectureUVFichier("ressources/" + sessionID, 0);
		ObservableList<String> ObserListNom =FXCollections.observableArrayList (fichier.getListUV());
		loadGrid(ObserListNom);
		loadButtons();
	}

	public void init(DirectorController directorController) {
		director = directorController;
	}
		
	private void loadGrid(ObservableList<String> names) {

		gridCandidats.getChildren().clear(); // clear gridPane
		
		// setup column titles
		//Label counter = new Label("Candidats acceptés");
		Label candi = new Label(" Candidatures acceptées   ");
		TextField counter= new TextField("0");
		counter.setPrefWidth(40);
		Text txtNameTitle = new Text("Noms des Candidats");
		Text txtAccepteTitle = new Text("Accepté");
		Text txtRefuseTitle = new Text("Refusé");
		Text txtAttenteTitle = new Text("Liste d'Attente");
		
		HBox hbTitle = new HBox(txtAccepteTitle, txtRefuseTitle, txtAttenteTitle);
		HBox boxCounter = new HBox(candi,counter);
		boxCounter.setPadding(new Insets(10, 10, 10, 10));
		hbTitle.setSpacing(65);
		hbTitle.setPadding(new Insets(10, 10, 10, 10));
		//txtNameTitle.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		
		gridCandidats.add(txtNameTitle,0,0); // (txtNameTitle, column, row)
		gridCandidats.add(hbTitle,1,0);
		gridCandidats.add(boxCounter,0,1000);
		
		Iterator<String> iter = names.iterator();
		int i=1;
		
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
			radioGroup.selectToggle(rdoAttente);
			
			// putting RadioButtons into HBox for easy horizontal distribution
			HBox hb = new HBox(rdoAccepte, rdoRefuse, rdoAttente);
			hb.setSpacing(100);
			hb.setPadding(new Insets(10, 10, 10, 10));
			
			Text txtName = new Text();
			txtName.setText(iter.next());
			// adding names and RadioButtons to gridPane
			gridCandidats.add(txtName, 0, i);
			gridCandidats.add(hb,1,i);
			i++;
			
			// try to increase counter everytime the radio button is selected
						
						
			radioGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
							        {
							 			 public void changed(ObservableValue<? extends Toggle> ov, Toggle toggle, Toggle new_toggle)
							            {
							 			int count = 0;			        	
							               if (radioGroup.getSelectedToggle() == rdoAccepte)
							                     {
							                       	count ++; counter.setText(""+count);
							                       	}
							            	   							                
							                else
							                { 
							                		                  		                    
							                }
							            } 
							        });
		};
		
	}
	
	
	private void loadButtons(){
		Button btnCloturer = new Button();
		Button btnEnvoyer = new Button();
		btnCloturer.setText("Clôturer la session");
		btnEnvoyer.setText("Valider les candidatures");
		btnCloturer.setVisible(true); //need to call function that determins how to show button
		btnCloturer.setVisible(true); //need to call function that determins how to show button

		HBox hbButtons = new HBox(btnCloturer, btnEnvoyer);
		hbButtons.setSpacing(100);
		hbButtons.setPadding(new Insets(10, 10, 10, 10));
		bdrPaneCandidats.setBottom(hbButtons);
		
		
		
	}
}



		
