package spectacle;

public class Seance {
	
	private String date;
	private String spectacle;
	public Seance(String date, String spectacle) {
		super();
		this.date = date;
		this.spectacle = spectacle;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSpectacle() {
		return spectacle;
	}
	public void setSpectacle(String spectacle) {
		this.spectacle = spectacle;
	}
	
	

}
