package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		Autor a = new Autor ("Haled", "Hoseini");
		Knjiga k = new Knjiga ("978-99-7653-643-3", "Lovac na zmajeve", 2003, a);
        k.print();
        System.out.println();
        
        Autor b = new Autor ("Dobrica", "Cosic");
        Knjiga r = new Knjiga ("988-77-9854-123-7", "Koreni", 1954, b);
        r.print();
        System.out.println();
        
        Autor c = new Autor ("Joanne", "Rowling");
        Knjiga m = new Knjiga ("906-11-3748-123-9", "Harry Potter", 1997, c);
        m.print();
        System.out.println();
	}

}
