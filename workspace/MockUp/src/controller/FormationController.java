package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitMenuButton;



public class FormationController implements Initializable{

	@FXML
	private ListView<String> UVListView;
	  	
	@FXML
	private SplitMenuButton btnFormation;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ArrayList<String> ListeUVList = new  ArrayList<String>();
		ListeUVList.add("INC1");
		ListeUVList.add("INC2");
		ListeUVList.add("FORM1");
		ListeUVList.add("FORM2");
		
		ObservableList<String> ListeUV = FXCollections.observableArrayList(ListeUVList);
		
		UVListView.setItems(ListeUV);
	}

	@FXML private void btnFormation1Clicked(ActionEvent event){
		System.out.println("Button Formation Clicked");
	}
}