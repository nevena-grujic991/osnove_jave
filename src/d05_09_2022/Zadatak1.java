package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

   Magacioner mm = new Magacioner ("Nenad Markovic");
   Menadzer nn = new Menadzer ("Mirko Ilic");

   Sektor nabavka = new Sektor ("nabavka", 50000);
   Sektor trgovina = new Sektor ("trgovina", 80000);
   Sektor racunovodstvo = new Sektor ("racunovodstvo", 90000);
   Sektor kontrola = new Sektor ("kontrola", 85000);
   
   mm.zaposliUSektor(trgovina);
   mm.zaposliUSektor(nabavka);
   mm.plata();
   
   nn.zaposliUSektor(racunovodstvo);
   nn.zaposliUSektor(kontrola);
   nn.plata();
   
   System.out.println("Magacioner: " + mm.getImePrezime() + " - plata: " + mm.plata() + " RSD");
   System.out.println("Menadzer: " + nn.getImePrezime() + " - plata: " + nn.plata() + " RSD");
   
   
	}

}
