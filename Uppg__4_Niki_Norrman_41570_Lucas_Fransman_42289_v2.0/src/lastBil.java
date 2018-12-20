
public class lastBil extends fordon {
	String marke;
	String modell;
	String loadedWith;
	int capacity;
	String depart;
	String destination;
	
	public lastBil(String regNr, String owner, String marke, String modell, String loadedWith, int capacity, String depart, String destination) {
		super(regNr, owner);
		this.marke = marke;
		this.modell = modell;
		this.loadedWith = loadedWith;
		this.capacity = capacity;
		this.depart = depart;
		this.destination = destination;
	}
	
	public String getMarke() {
		return marke;
	}
	public String getModell() {
		return modell;
	}
	public String getLoad() {
		return loadedWith;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getDepart() {
		return depart ;
	}
	public String getDestination() {
		return destination;
	}
}
