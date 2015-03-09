package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class FormationController implements Initializable{

	@FXML
	private ListView<String> UVList;
	  	
	@FXML
	private SplitMenuButton btnFormation;
	@FXML
	private TextArea UVDesc;
	
	@FXML
	private ListView<String> SessionList;
	
	@FXML
	private TextArea InfoSession;
    //private ObservableList<String> ListeUV = FXCollections.observableArrayList();
	
//	private void chargementUV (ObservableList<String> ListeUV){
//		
//	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ArrayList<String> ListeUVList = new  ArrayList<String>();
		ListeUVList.add("INC1");
		ListeUVList.add("INC2");
		ListeUVList.add("FORM1");
		ListeUVList.add("FORM2");
		
		ObservableList<String> ListeUV = FXCollections.observableArrayList(ListeUVList);
		
		UVList.setItems(ListeUV);
						
        //UVColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());

	}

	@FXML private void btnFormation1Clicked(ActionEvent event){
		System.out.println("Button Formation Clicked");
	}
	
	
	
	@FXML
    void clicUV(Event event) {
    	
    	//String items =UVList.getSelectionModel().getSelectedItem();
    	//L'affichage de la descritpion de l'UV
    	String description= new String("la description de l'UV");
    	UVDesc.setText(description);
    	UVDesc.setEditable(false);
    	
    	//l'affichage des sessions 
    	ArrayList<String> SessionUVList = new  ArrayList<String>();
    	SessionUVList.add("Rennes");
    	SessionUVList.add("St Malo");
    	SessionUVList.add("Redon");
		
		ObservableList<String> SessionUV = FXCollections.observableArrayList(SessionUVList);
		
		SessionList.setItems(SessionUV);
    }
	
	@FXML
    void clicSession(Event event) {
    	
    	//String items =UVList.getSelectionModel().getSelectedItem();
    	//L'affichage des infos détaillées de la session 
    	String infos= new String("les infos détaillées de la session"+
    							"\n"+"La session se déroule à:...");
    	InfoSession.setText(infos);
    	InfoSession.setEditable(false);
    	
    	
    }
}