package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Zadatak
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

		printJmbg("1234567890");
		printIme("Nevena");
		printPrezime("Grujic");
		printGodinaRodjenja(1991);
		printAktivnost(true);
		
		
		
	}

	public static void printJmbg (String jmbg) {
	System.out.println("JMBG: " + jmbg);
	}
	public static void printIme (String ime) {
	System.out.println("Ime: " + ime); 
	}
	public static void printPrezime (String prezime) {
	System.out.println("Prezime: " + prezime);
	}
    public static void printGodinaRodjenja (int godinaRodjenja){
    System.out.println("Godina rodjenja: " + godinaRodjenja);	
    }
    public static void printAktivnost (boolean aktivnost) {
    System.out.println("Aktivan: " + aktivnost);	
    }
}

