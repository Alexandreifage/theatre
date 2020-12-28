package Personne;

import java.util.ArrayList;

import spectacle.Spectacle;

public class MetteurEnScene extends Artiste {

	public MetteurEnScene(String prenom, String nom, char sexe, String dateNaissance, String adresse, String telephone,
			String email, ArrayList<Spectacle> participationSpectacle) {
		super(prenom, nom, sexe, dateNaissance, adresse, telephone, email, participationSpectacle);
	}
	public MetteurEnScene(String prenom, String nom) {
		super(prenom, nom);
	}
	
}
