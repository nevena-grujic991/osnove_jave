package d16_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezinaUGramima;
	
	public void stampaj () {
	System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaUGramima);
	}
	
	public double konvertuj (String jedinicaMere) {
		if (jedinicaMere.equals("kg")) {
		return this.tezinaUGramima/1000;
		} else if (jedinicaMere.equals("t")){
		return this.tezinaUGramima/1000000;
		} else {
		return 0;
			
		}
	}
	
	}

