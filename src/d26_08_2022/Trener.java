package d26_08_2022;

public class Trener extends Osoba {
  private int godineIskustva;
  private String tipTrenera;
  
public Trener(String imePrezime, String jmbg, int godinaRodjena, int godineIskustva, String tipTrenera) {
	super(imePrezime, jmbg, godinaRodjena);
	this.godineIskustva = godineIskustva;
	this.tipTrenera = tipTrenera;
}
  @Override
  public void stampaj() {
  super.stampaj();
  System.out.println(this.godineIskustva + ", " + this.tipTrenera);
  }
  
}