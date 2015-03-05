package model;


import java.time.LocalDate;
import java.util.List;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * Created with Eclipse.
 * Author : Caroline Chabert
 * Class to get and set UVs data hosted by the server (cloning of data)
 * 
 */

public class UVConcret {
	
	private final StringProperty UV;
	
    public UVConcret() {
        this(null);
    }
    
    public UVConcret(String UV) {
        this.UV = new SimpleStringProperty(UV);
  
    }

    public StringProperty UVProperty() {
        return UV;
    }
}
