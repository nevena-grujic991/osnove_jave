package d23_08_2022;

public class ZeleniKarton {
	private String imePrezimeStudent;
	private int brojIndeksa;
	private String predmet;
	private String imePrezimeProfesor;
	private int ocena;
	
	public ZeleniKarton(String imePrezimeStudent, int brojIndeksa, String predmet, String imePrezimeProfesor,
			int ocena) {
		this.imePrezimeStudent = imePrezimeStudent;
		this.brojIndeksa = brojIndeksa;
		this.predmet = predmet;
		this.imePrezimeProfesor = imePrezimeProfesor;
		this.ocena = ocena;
	}

	public String getImePrezimeStudent() {
		return imePrezimeStudent;
	}

	public void setImePrezimeStudent(String imePrezimeStudent) {
		this.imePrezimeStudent = imePrezimeStudent;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getImePrezimeProfesor() {
		return imePrezimeProfesor;
	}

	public void setImePrezimeProfesor(String imePrezimeProfesor) {
		this.imePrezimeProfesor = imePrezimeProfesor;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	public boolean polozen() {
	if (this.ocena > 5) {
	return true;
	}else{
	return false;
	}}
	
	public void print() {
	System.out.println(this.predmet + " - " + this.ocena);
	System.out.println("Student: " + this.imePrezimeStudent + ", " + this.brojIndeksa);
	System.out.println("Profesor: " + this.imePrezimeProfesor);
	}
	}


