package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

		Proizvod proizvod1 = new Proizvod();
		proizvod1.naziv = "So";
		proizvod1.cena = 50.3;
		proizvod1.tezinaUGramima = 1000;
		
		Proizvod proizvod2 = new Proizvod();
		proizvod2.naziv = "Secer";
		proizvod2.cena = 70.2;
		proizvod2.tezinaUGramima = 1200;
		
		proizvod1.stampaj();
		proizvod2.stampaj();
		
		System.out.println("Tezina proizvoda " + proizvod1.naziv + " u kilogramima iznosi " + proizvod1.konvertuj("kg"));
		System.out.println("Tezina proizvoda " + proizvod2.naziv + " u tonama iznosi " + proizvod2.konvertuj("t"));
		
		
		

	}

}
