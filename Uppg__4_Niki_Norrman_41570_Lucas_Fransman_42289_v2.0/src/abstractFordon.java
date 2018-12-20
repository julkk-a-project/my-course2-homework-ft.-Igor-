import java.util.ArrayList;

public abstract class abstractFordon {
	String regNr;
	String owner;
	public String marke;
	String modell;
	int saten;
	String loadedWith;
	int capacity;
	String depart;
	String destination;
	double motorVol;
	int hk;
	double forbrukning;
	int km;
	
	public abstract void utskrift(ArrayList <fordon> list, int counter);
	
	public String getRegNr() {
		return regNr;
	}
	public String getOwner() {
		return owner;
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
	public String getLoad() {
		return loadedWith;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getDepart() {
		return depart;
	}
	public String getDestination() {
		return destination;
	}
	public double getMotorVol() {
		return motorVol;
	}
	public int getHk() {
		return hk;
	}
	public double getForbrukning() {
		return forbrukning;
	}
	public int getKm() {
		return km;
	}
	
}
