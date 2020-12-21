package fauteuil;

public class Fauteuil {
	
	
	
	private String numeroFauteuil;
	private String nomSpectacle;
	private String date;
	private String prenom;
	private String nom;
	private boolean reserve;
	
	public Fauteuil (String numeroFauteuil, String nomSpectacle,String date, String prenom, String nom,  boolean reserve) {
		
		
		this.numeroFauteuil = numeroFauteuil;
		this.nomSpectacle = nomSpectacle;
		this.date = date;
		this.prenom = prenom;
		this.nom = nom;
		this.reserve = reserve;
	}
	
	public String getNumeroFauteuil() {
		return numeroFauteuil;
	}
	public void setNumeroFauteuil(String numeroFauteuil) {
		this.numeroFauteuil = numeroFauteuil;
	}
	
	public String getNomSpectacle() {
		return nomSpectacle;
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
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isReserve() {
		return reserve;
	}
	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}

}
