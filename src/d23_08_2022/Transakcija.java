package d23_08_2022;

public class Transakcija {
	private String id;
	private String racunSalje;
	private String racunPrima;
	
	public Transakcija(String id, String racunSalje, String racunPrima) {
		super();
		this.id = id;
		this.racunSalje = racunSalje;
		this.racunPrima = racunPrima;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRacunSalje() {
		return racunSalje;
	}

	public void setRacunSalje(String racunSalje) {
		this.racunSalje = racunSalje;
	}

	public String getRacunPrima() {
		return racunPrima;
	}

	public void setRacunPrima(String racunPrima) {
		this.racunPrima = racunPrima;
	}
    public double provizija (double prenosSredstava) {
    if (prenosSredstava <=4500)	{
    return 45;
    }else{
    return prenosSredstava/100;
    }}
    
    public void print() {
    System.out.println(this.id);
    }
	
}
	

