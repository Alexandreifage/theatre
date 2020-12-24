package spectacle;

import java.sql.Date;

import java.util.ArrayList;

import Personne.Comedien;
import Personne.MetteurEnScene;

public class Spectacle {
	
	private String nomSpectacle;
	private String date;
	private String heure;
	private String nomAuteur;
	private MetteurEnScene metteurEnScene;
	private ArrayList<Comedien> lstComedien = new ArrayList<>();
	
	public Spectacle (String nomSpectacle, String date, String heure, String nomAuteur, MetteurEnScene metteurEnScene, ArrayList<Comedien> lstComedien){
		this.nomSpectacle = nomSpectacle;
		this.date = date;
		this.heure = heure;
		this.nomAuteur = nomAuteur;
		this.metteurEnScene = metteurEnScene;
		this.lstComedien = lstComedien;	
	}
	
	public String getNomSpectacle() {
		return this.nomSpectacle;
	}
	public void setNomSpectacle(String nomSpectacle) {
		this.nomSpectacle = nomSpectacle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public MetteurEnScene getMetteurEnScene() {
		return metteurEnScene;
	}

	public void setMetteurEnScene(MetteurEnScene metteurEnScene) {
		this.metteurEnScene = metteurEnScene;
	}

	public ArrayList<Comedien> getLstComedien() {
		return lstComedien;
	}

	public void setLstComedien(ArrayList<Comedien> lstComedien) {
		this.lstComedien = lstComedien;
	}
	public Comedien getComedien(int i) {
		return lstComedien.get(i);
	}

	@Override
	public String toString() {
		return "Spectacle [nomSpectacle=" + nomSpectacle + ", date=" + date + ", heure=" + heure + ", nomAuteur="
				+ nomAuteur + ", metteurEnScene=" + metteurEnScene + ", lstComedien=" + lstComedien + "]";
	}
	 
}
