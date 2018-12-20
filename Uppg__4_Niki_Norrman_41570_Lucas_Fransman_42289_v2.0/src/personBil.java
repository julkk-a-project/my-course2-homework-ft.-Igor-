
public class personBil extends fordon {
	public String marke;
	String modell;
	int saten;
	double motorVol;
	int hk;
	double forbrukning;
	int km;
	
	public personBil(String regNr, String owner, String marke, String modell, int saten, double motorVol, int hk, double forbrukning, int km) {
		super(regNr, owner);
		this.marke = marke;
		this.modell = modell;
		this.saten = saten;
		this.motorVol = motorVol;
		this.hk = hk;
		this.forbrukning = forbrukning;
		this.km = km;
	}
	
	public String getMarke() {
		return marke;
	}
	public String getModell() {
		return modell;
	}
	public int getSaten() {
		return saten;
	}
	public double getMotorVol(){
		return motorVol;
	}
	public int getHk(){
		return hk;
	}
	public double getForbrukning(){
		return forbrukning;
	}
	public int getKm(){
		return km;
	}
}
