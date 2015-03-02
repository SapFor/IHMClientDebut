package controller;

import model.LectureUVFichier;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


/**
 * 
 * @author May Workman
 *
 */

public class DirectorRightController {

	//private DirectorController director;
	private String sessionToken;
	
	@FXML
    private Label nom;
	
	@FXML
    private Label prenom;
		
				
/*	public void init(DirectorController directorController) {
		director = directorController;
	}*/
	
	public void getSessionToken(String token){
		sessionToken = token;
		showCandidats(sessionToken);
	}

    private void showCandidats(String sessionToken) {
    	nom.setText(sessionToken);
    	
  /*  	
    	LectureUVFichier fichierStageInfo = new LectureUVFichier("ressources/" + sessionToken, 0);
    	String ligneLu = "";
    	
    	// lecture du fichier jusqu'a la ligne candidats
    	while( ligneLu != "candidats"){
    		ligneLu = fichierStageInfo.lireLigneSuivante();
    	}
    	
    	// lecture du premier candidat
    	ligneLu = fichierStageInfo.lireLigneSuivante();
    	
    	// lecture de l'info de chaque candidat
    	while( ligneLu != "fcandidats"){
    		LectureUVFichier fichierCandidatInfo = new LectureUVFichier("ressources/ligneLu", 0);
    		String ligne2Lu = "";
    		
    		// lecture du fichier jusqu'a la ligne nom
    		while( ligne2Lu != "nom"){
	    		ligne2Lu = fichierCandidatInfo.lireLigneSuivante();
	    	}
    		
    		// lecture du nom
    		nom.setText(fichierCandidatInfo.lireLigneSuivante());
    		while( ligne2Lu != "prenom"){
	    		ligne2Lu = fichierCandidatInfo.lireLigneSuivante();
	    	}
    		
    		// lecture du prenom
    		prenom.setText(fichierCandidatInfo.lireLigneSuivante());
    	} */
    }



		
}