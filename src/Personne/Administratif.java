package Personne;

public class Administratif extends Personnel {
	
	private String metier;

	public Administratif(String prenom, String nom, char sexe, String dateNaissance, String adresse, String telephone,
			String email, String metier) {
		super(prenom, nom, sexe, dateNaissance, adresse, telephone, email);
		this.metier = metier;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}
}
