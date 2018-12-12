
public class LastBil extends Fordon {
	public String model;
	public String maker;
	
	
	
	//Simple Truck
	public LastBil(String regNr, String owner, String maker, String model) {
		super(regNr, owner);
		this.maker = maker;
		this.model = model;
		this.type = 2;
	}
	
	//Complex Truck
	public LastBil(String regNr, String owner, String maker, String model, String loadedWith, int Capacity) {
		super(regNr, owner);
		this.maker = maker;
		this.model = model;
		this.type = 2;
	}
	
	
	
	public String getModel() {
		return this.model;
	}
	public String getMaker() {
		return this.maker;
	}

}
