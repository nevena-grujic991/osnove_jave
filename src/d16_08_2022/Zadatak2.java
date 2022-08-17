package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
//			Metoda kao parametar prima temperaturu koja je napolju.
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode


		SmartAirConditioning uredjaj1 = new SmartAirConditioning();
		uredjaj1.marka = "Gorenje";
		uredjaj1.temperatura = 25.5;
		uredjaj1.mod = "grejanje";
		
		SmartAirConditioning uredjaj2 = new SmartAirConditioning();
		uredjaj2.marka = "LG";
		uredjaj2.temperatura = 18.5;
		uredjaj2.mod = "hladjenje";
		
		uredjaj1.stampaj();
		uredjaj2.stampaj();
		
		boolean a = uredjaj1.razlikaUTemperaturi(20);
		System.out.println("Unutrasnja temperatura je " + uredjaj1.temperatura);
		if (a==true) {
		System.out.println("Spoljna temperatura je manja");
		} else {
		System.out.println("Spoljna temperatura je veca");
		
		boolean b = uredjaj2.razlikaUTemperaturi(20);
		System.out.println("Unutrasnja temperatura je " + uredjaj2.temperatura);
		if (b==true) {
		System.out.println("Spoljna temperatura je manja");
		} else {
		System.out.println("Spoljna temperatura je veca");	
		}
		
		}

}
}