package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	private ArrayList<Ambalaza>ambalaze = new ArrayList<Ambalaza>();

	public Korpa() {
		super();
	}

	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}
	
	public void dodajAmbalazu (Ambalaza ambalaza) {
	this.ambalaze.add(ambalaza);
	}

	public void izbaciAmbalazu (String barkod) {
	for (int i = 0; i < this.ambalaze.size(); i++) {
	if (barkod.equals(this.ambalaze.get(i).getBarkod())) {
	this.ambalaze.remove(i);
	}}}

    private double cenaSvihAmbalazaSaPopustom (double popust) {
    double suma = 0;
    for (int i = 0; i < this.ambalaze.size(); i++) {
    suma = suma + this.ambalaze.get(i).cenaArtikla();
    }
    return suma - popust;
		
	}
    public double ukupnaCenaKorpe (SuperKartica kartica) {
    return this.cenaSvihAmbalazaSaPopustom(kartica.getPopust());
    }}
