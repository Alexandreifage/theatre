package Personne;

import java.util.ArrayList;

import spectacle.Spectacle;

public class Artiste extends Personnel {
	
	private ArrayList<Spectacle> participationSpectacle;
	

	public Artiste(String prenom, String nom, char sexe, String dateNaissance, String adresse, String telephone,
			String email, ArrayList<Spectacle> participationSpectacle) {
		super(prenom, nom, sexe, dateNaissance, adresse, telephone, email);
		this.participationSpectacle = participationSpectacle;
		
	}
	public Artiste(String prenom, String nom) {
		super(prenom, nom);

	}
	
	public Artiste(String prenom, String nom, char sexe, String dateNaissance, String adresse, String telephone,
			String email) {
		super(prenom, nom);
	}
	
	

	public ArrayList<Spectacle> getParticipationSpectacle() {
		return participationSpectacle;
	}

	public void setParticipationSpectacle(ArrayList<Spectacle> participationSpectacle) {
		this.participationSpectacle = participationSpectacle;
	}

	
	
	

	
}
