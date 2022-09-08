package d06_09_2022;

public class SuperKartica {
	private String brojKartice;
	private String imePrezimeVlasnik;
	private int popust;
	
	public SuperKartica() {
		super();
	}
	public SuperKartica(String brojKartice, String imePrezimeVlasnik, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.imePrezimeVlasnik = imePrezimeVlasnik;
		this.popust = popust;
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}
	public String getImePrezimeVlasnik() {
		return imePrezimeVlasnik;
	}
	public void setImePrezimeVlasnik(String imePrezimeVlasnik) {
		this.imePrezimeVlasnik = imePrezimeVlasnik;
	}
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void stampaj() {
	System.out.println(this.brojKartice + ", "+ this.imePrezimeVlasnik);
	}
}
