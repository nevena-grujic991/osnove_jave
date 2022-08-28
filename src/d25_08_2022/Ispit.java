package d25_08_2022;

public class Ispit {
	private String predmet;
	private int ocena;
	private String profesor;
	
	public Ispit(String predmet, int ocena, String profesor) {
		this.predmet = predmet;
		this.ocena = ocena;
		this.profesor = profesor;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public boolean polozen () {
	if (this.ocena >= 6 && this.ocena <= 10) {
	return true;
	} else {
	return false;
	}}
	public void print() {
	System.out.println(this.predmet + " - " + this.profesor + " - " + this.ocena);
	

}}
