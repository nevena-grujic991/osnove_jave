package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

		stampajVrednostZa10Vecu(9);

	}

	public static void stampajVrednostZa10Vecu (int a) {
	a=a+10;	
	System.out.println("Vrednost za 10 veca je " + a);
	}
}
