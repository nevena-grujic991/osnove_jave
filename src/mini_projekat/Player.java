package mini_projekat;

public class Player {
	private String imePrezime;

	public Player(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}

	public Player() {
		super();
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public void print () {
	System.out.println("Ime i prezime igraca: " + this.imePrezime);
	}

}
