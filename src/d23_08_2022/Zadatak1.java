package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite.

     ArrayList<ZeleniKarton>ispiti = new ArrayList<ZeleniKarton>();
     
     ZeleniKarton karton1 = new ZeleniKarton("Petar Ilic", 1230, "Matematika", "Dragan Manic", 8);
     ZeleniKarton karton2 = new ZeleniKarton("Marija Savic", 1349, "Fizika", "Ivan Ivic", 7);
     ZeleniKarton karton3 = new ZeleniKarton("Andrija Dacic", 1219, "Informatika", "Predrag Savic", 10);
     ZeleniKarton karton4 = new ZeleniKarton("Ivan Peric", 1190, "Elektronsko poslovanje", "Drasko Peric", 6);
     ZeleniKarton karton5 = new ZeleniKarton("Milica Ilic", 1230, "Sociologija", "Ivica Jovanovic", 5);
     ZeleniKarton karton6 = new ZeleniKarton("Dragana Grujic", 1213, "Ekonomika", "Vladan Mladenovic", 9);
     ZeleniKarton karton7 = new ZeleniKarton("Ivana Krstic", 1185, "Osnovi menadzmenta", "Natalija Mitic", 10);
     ZeleniKarton karton8 = new ZeleniKarton("Katarina Mitic", 1830, "Hemija", "Miroljub Petkovic", 10);
     ZeleniKarton karton9 = new ZeleniKarton("Milan Manic", 1990, "Geografija", "Dalibor Devic", 5);
     ZeleniKarton karton10 = new ZeleniKarton("Vladimir Ilic", 1333, "Poslovne finansije", "Svetozar Boskovic", 6);
     
     ispiti.add(karton1);
     ispiti.add(karton2);
     ispiti.add(karton3);
     ispiti.add(karton4);
     ispiti.add(karton5);
     ispiti.add(karton6);
     ispiti.add(karton7);
     ispiti.add(karton8);
     ispiti.add(karton9);
     ispiti.add(karton10);

     for (int i=0; i<ispiti.size();i++) {
    	    ispiti.get(i).print();
}
}
}