package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za 
//		koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova 
//		funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.
//		Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu
//		od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod 
//		šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena
//		postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati 
//		svaku od definisanih funkcija.

		Proizvod proizvod1 = new Proizvod();
		proizvod1.naziv = "knjiga";
		proizvod1.cena = 500.5;
		proizvod1.tezinaGrami = 300.5;
		
		
		Proizvod proizvod2 = new Proizvod();
		proizvod2.naziv = "igracka";
		proizvod2.cena = 800.5;
		proizvod2.tezinaGrami = 600.5;
		
		proizvod1.stampaj();
		proizvod2.stampaj();
		
		proizvod1.povecajCenu(102.3);
		proizvod2.povecajCenu(107.4);
		System.out.println("Uvecana cena proizvoda " + proizvod1.naziv + " iznosi " + proizvod1.cena);
		System.out.println("Uvecana cena proizvoda " + proizvod2.naziv + " iznosi " + proizvod2.cena);
		
		
		System.out.println("Cena sa popustom je " + proizvod1.vratiCenuSaPopustom(10));
		System.out.println("Cena sa popustom je " + proizvod2.vratiCenuSaPopustom(7));
		
		System.out.println("Za proizvod " + proizvod1.naziv + "postarina je " + proizvod1.racunajPostarinu());
		System.out.println("Za proizvod " + proizvod2.naziv + "postarina je " + proizvod2.racunajPostarinu());
		
	}

}
