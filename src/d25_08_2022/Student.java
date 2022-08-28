package d25_08_2022;

import java.util.ArrayList;

public class Student {
  private String brojIndeksa;
  private String imePrezime;
  private String tipStudija;
  private ArrayList<Ispit>ispiti = new ArrayList<Ispit>();

  

public Student(String brojIndeksa, String imePrezime, String tipStudija) {
	this.brojIndeksa = brojIndeksa;
	this.imePrezime = imePrezime;
	this.tipStudija = tipStudija;
}

public String getBrojIndeksa() {
	return brojIndeksa;
}

public String getImePrezime() {
	return imePrezime;
}

public String getTipStudija() {
	return tipStudija;
}

public ArrayList<Ispit> getIspiti() {
	return ispiti;
}

public void setBrojIndeksa(String brojIndeksa) {
	this.brojIndeksa = brojIndeksa;
}

public void setImePrezime(String imePrezime) {
	this.imePrezime = imePrezime;
}

public void setTipStudija(String tipStudija) {
	this.tipStudija = tipStudija;
}
  public void dodajIspit (Ispit ispit) {
  this.ispiti.add(ispit);
  }
  private int racunajProsek () {
  int prosek = 0;
  for (int i = 0; i<this.ispiti.size();i++) {
  prosek = this.ispiti.get(i).getOcena()/this.ispiti.size();
  }
  return prosek;
  }
  
  public void print () {
  System.out.println(this.brojIndeksa + " - " + this.imePrezime + " - " + this.tipStudija);
  for (int i = 0; i<this.ispiti.size();i++) {
  System.out.println("Predmeti: ");
  this.ispiti.get(i).print();
  }
  System.out.println("Prosecna ocena: " + this.racunajProsek());
  }
}