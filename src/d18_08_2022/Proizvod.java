package d18_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezinaGrami;
	
	public void stampaj () {
	System.out.println(naziv + ", " + cena + ", " + tezinaGrami);
	}
	
    public void povecajCenu (double povecanje) {
    this.cena = this.cena + povecanje;
    }
    
    public double vratiCenuSaPopustom (double popust) {
    return (this.cena - (this.cena*popust/100));
    }
    
    public double racunajPostarinu () {
    if (this.tezinaGrami <= 100) {
    return 200;
    }else if (this.tezinaGrami > 100 && this.tezinaGrami <= 500){
    return 400;
    }else if (this.tezinaGrami > 500){
    return 1000;

}
    }
}   