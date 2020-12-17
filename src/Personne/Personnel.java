package Personne;

public class Personnel extends Personne {

	private char sexe;
	private String dateNaissance;
	private String adresse;
	private String telephone;
	private String email;
	
	public Personnel(String prenom, String nom, char sexe, String dateNaissance, String adresse,
			String telephone, String email) {
		super(prenom, nom);
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;

	}	
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public String dateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance (String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String adresse() {
		return adresse;
	}
	public void setAdresse (String adresse ) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone (String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail (String email) {
		this.email = email;
	}

}