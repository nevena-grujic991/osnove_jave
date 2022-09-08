package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	protected String imePrezime;
	protected ArrayList<Sektor>sektori = new ArrayList<Sektor>();
	
	public Radnik(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}
	
	public abstract double plata ();
	
	public void zaposliUSektor (Sektor sektor) {
	sektori.add(sektor);
	}
}
