package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima. 


		printOperations(10,5);
		printOperations(10,5);
		printOperations(10,5);
		
		
	}

	public static void printOperations (int a, int b) {
	System.out.println("Zbir " + (a+b) + " razlika " + (a-b) + " proizvod " + (a*b) + " kolicnik " + (a/b) );
	}
}
