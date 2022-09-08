package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {
	private double kaucija;
	private boolean platiKauciju;
	private double osnovnaCena;
	
	public StaklenaAmbalaza() {
		super();
	}
	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.platiKauciju = platiKauciju;
		this.osnovnaCena = osnovnaCena;
	}
	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlatiKauciju() {
		return platiKauciju;
	}
	public void setPlatiKauciju(boolean platiKauciju) {
		this.platiKauciju = platiKauciju;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
	if (this.platiKauciju == true) {
	return this.osnovnaCena*1.2+this.kaucija;
	}else {
	return this.osnovnaCena*1.2;	
	}}
	
	@Override
	public void stampaj() {
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Neto tezina: " + this.netoTezina);
		System.out.println("Bruto tezina: " + this.brutoTezina);
		System.out.println("Kaucija se placa: " + this.isPlatiKauciju());
		if (this.platiKauciju == true) {
		System.out.println("Kaucija je: " + this.kaucija);
		}
		System.out.println("Osnovna cena je: " + this.osnovnaCena);	
	}
}
   