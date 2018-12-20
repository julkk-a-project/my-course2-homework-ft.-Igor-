
public class LastBilEgenskaper implements IEgenskaper {
	
	public String loadedWith;
	public int capacity;
	public String depart;
	public String destination;
	
	
	
	public LastBilEgenskaper(String loadedWith, int capacity, String depart, String destination) {
		this.loadedWith = loadedWith;
		this.capacity = capacity;
		this.depart = depart;
		this.destination = destination;
	}



	@Override
	public String getProperties() {
		return ", "+loadedWith+", "+capacity+", "+depart+", "+destination;
	}
}
