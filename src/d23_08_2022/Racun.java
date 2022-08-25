package d23_08_2022;

public class Racun {
	private String brojRacuna;
	private String imePrezime;
	private double trenutnoStanje;
	
	public Racun(String brojRacuna, String imePrezime, double trenutnoStanje) {
		this.brojRacuna = brojRacuna;
		this.imePrezime = imePrezime;
		this.trenutnoStanje = trenutnoStanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	public void promenaStanja (double prosledjenaVrednost) {
	this.trenutnoStanje = this.trenutnoStanje + prosledjenaVrednost;
	if (this.trenutnoStanje<0) {
	this.trenutnoStanje=0;
	}
	}
	
	public void print () {
	System.out.println(this.imePrezime + " - " + this.brojRacuna);
	System.out.println("Stanje na racunu je: " + this.trenutnoStanje + " RSD.");
	}
	

}
