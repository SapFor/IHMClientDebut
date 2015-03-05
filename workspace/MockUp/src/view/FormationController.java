package view;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;

import model.UVConcret;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.fxml.FXML;
import javafx.scene.control.Button;




public class FormationController{

	@FXML
    private TableView<UVConcret> TableUV;
	
	@FXML
    private TableColumn<UVConcret,String> TableUVColone;

	private ObservableList<UVConcret> UVData = FXCollections.observableArrayList();

	@FXML
	private void initialize() {
		List<String> listUV = new ArrayList<String>();
		listUV.add(new String("A1"));  
		listUV.add(new String("A2"));  
		listUV.add(new String("A3"));  
		listUV.add(new String("A4"));  
		listUV.add(new String("A5"));  
		for(Iterator i = listUV.iterator(); i.hasNext();)  
		{
			UVData.add(new UVConcret(i.next().toString()));
		}
		//UVData.add(new UVConcret("test"));	
		TableUV.setItems(UVData);
		TableUVColone.setCellValueFactory(cellData -> cellData.getValue().UVProperty());
		
	}


}