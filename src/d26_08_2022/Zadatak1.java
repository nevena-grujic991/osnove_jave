package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.


		Igrac igrac1 = new Igrac ("Petar Petrovic", "1234567891479", 1991, 1, "golman", false);
		Igrac igrac2 = new Igrac ("Ivan Ivic", "1234567891986", 1989, 9, "napadac", false);
		
		Trener trener1 = new Trener ("Marko Markovic", "1298467891966", 1975, 10, "kondicioni");
		Trener trener2 = new Trener ("Darko Darkovic", "1234567891479", 1970, 5, "pomocni");
		
		igrac1.stampaj();
		igrac2.stampaj();
		trener1.stampaj();
		trener2.stampaj();
	}

}
