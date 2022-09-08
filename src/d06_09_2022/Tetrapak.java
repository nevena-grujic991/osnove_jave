package d06_09_2022;

public class Tetrapak extends Ambalaza {
	private boolean reziklaza;
	private double osnovnaCena;
	
	public Tetrapak (String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
	super (barkod, nazivArtikla, netoTezina, brutoTezina);
	this.reziklaza = reciklaza;
	this.osnovnaCena = osnovnaCena;
	}

	public Tetrapak() {
		super();
	}

	public boolean isReziklaza() {
		return reziklaza;
	}

	public void setReziklaza(boolean reziklaza) {
		this.reziklaza = reziklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
    if (this.reziklaza == true) {
    return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
	}else {
	return this.osnovnaCena;
	}}

	@Override
	public void stampaj() {
	System.out.println("Barkod: " + this.barkod);
	System.out.println("Naziv artikla: " + this.nazivArtikla);
	System.out.println("Neto tezina: " + this.netoTezina);
	System.out.println("Bruto tezina: " + this.brutoTezina);
	System.out.println("Mogucnost reziklaze: " + this.reziklaza);
	System.out.println("Osnovna cena: " + this.osnovnaCena);
	}
}
