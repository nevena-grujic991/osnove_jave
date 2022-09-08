package d05_09_2022;

public class Magacioner extends Radnik {

	public Magacioner(String imePrezime) {
		super(imePrezime);
	}

	private double prosecnaPlata () {
	double suma = 0;
	for (int i = 0; i < sektori.size(); i++) {
	suma = suma + sektori.get(i).getPlata();
	}
	return (suma / sektori.size()*0.5);
	
	}
	@Override
	public double plata() {
	return prosecnaPlata() * sektori.size();
	}
}
