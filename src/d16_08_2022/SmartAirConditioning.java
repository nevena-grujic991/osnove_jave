package d16_08_2022;

public class SmartAirConditioning {

	public String marka;
	public double temperatura;
	public String mod;
	
	public void stampaj() {
	System.out.println("Marka klime je " + this.marka + ", temperatura je " + this.temperatura + ", ukljuceni mod je " + this.mod);	
	}
	public boolean razlikaUTemperaturi (int spoljnaTemperatura) {
	return spoljnaTemperatura < this.temperatura;	
	}
	
}
