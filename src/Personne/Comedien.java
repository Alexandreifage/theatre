package Personne;

import java.util.ArrayList;

import spectacle.Spectacle;

public class Comedien extends Artiste {
	
	private int taille;

	public Comedien(String prenom, String nom, char sexe, String dateNaissance, String adresse, String telephone,
			String email, ArrayList<Spectacle> participationSpectacle, int taille) {
		super(prenom, nom, sexe, dateNaissance, adresse, telephone, email, participationSpectacle);
		this.taille = taille;
	}
	public Comedien(String prenom, String nom) {
		super(prenom, nom);
		
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	
	
	
	
	
	
	
}
	
	