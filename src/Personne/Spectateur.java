package Personne;

public class Spectateur extends Personne {

	private String spectacleReserve;
	private String fauteuilReserve;
	
	public Spectateur(String prenom, String nom, String spectacleReserve, String fauteuilReserve) {
		super(prenom, nom);
		this.spectacleReserve = spectacleReserve;
		this.fauteuilReserve = fauteuilReserve;
	}

	public String getSpectacleReserve() {
		return spectacleReserve;
	}
	public void setSpectacleReserve(String spectacleReserve) {
		this.spectacleReserve = spectacleReserve;
	}

	public String getFauteuilReserve() {
		return fauteuilReserve;
	}

	public void setFauteuilReserve(String fauteuilReserve) {
		this.fauteuilReserve = fauteuilReserve;
	}
}