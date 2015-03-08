package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class FormationController implements Initializable{

	@FXML
	private ListView<String> UVList;
	  	
	@FXML
	private SplitMenuButton btnFormation;
	
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
}