
public class LastBil extends Fordon {
	public String model;
	public String maker;
	public LastBilEgenskaper stuff;
	
	
	//Simple Truck
	public LastBil(String regNr, String owner, String maker, String model) {
		super(regNr, owner);
		this.maker = maker;
		this.model = model;
		this.type = 2;
	}
	
	//Complex Truck
	public LastBil(String regNr, String owner, String maker, String model, String loadedWith, int capacity, String depart, String destination) {
		super(regNr, owner);
		this.maker = maker;
		this.model = model;
		this.type = 2;
		stuff = new LastBilEgenskaper(loadedWith, capacity, depart, destination);
	}
	@Override
	public String getProperties() {
		return super.getProperties()+", "+model+", "+maker+stuff.getProperties();	
	}
	
	
	public String getModel() {
		return this.model;
	}
	public String getMaker() {
		return this.maker;
	}

}
