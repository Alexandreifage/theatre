package Personne;

public class Spectateur extends Personne {

	private String date;
	private String siege;
	public Spectateur(String prenom, String nom, String date, String siege) {
		super(prenom, nom);
		this.date = date;
		this.siege = siege;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSiege() {
		return siege;
	}
	public void setSiege(String siege) {
		this.siege = siege;
	}
	
	
}
