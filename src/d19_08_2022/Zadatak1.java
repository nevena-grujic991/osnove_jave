package d19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post 
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			 Konstruktore:
//			difoltni konstuktor
//			konstuktor koji postavlja ime i prezime korisnika ko je objavio, 
//			korisnika na kom je profilu objavnljen i tekst objave
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 
//			(broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> 
//			(ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim 
//			pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1


		FacebookPost post1 = new FacebookPost();
		post1.setimeKoJeObjavio("Nevena Grujic");
		post1.setimeKodKogaJeObjavljeno("Milica Grujic");
		post1.settext("Preslusaj ovu pesmu: ");
		post1.setbrojLajkova(10);
		post1.setbrojDeljenja(2);
		post1.like();
		post1.dislike();
		post1.share();
		post1.print();
		
		FacebookPost post2 = new FacebookPost();
		post2.setimeKoJeObjavio("Marija Ilic");
		post2.setimeKodKogaJeObjavljeno("Ivana Milic");
		post2.settext("Hej vidi ovo: ");
		post2.setbrojLajkova(20);
		post2.setbrojDeljenja(1);
		post2.like();
		post2.dislike();
		post2.share();
		post2.print();
	}

}
