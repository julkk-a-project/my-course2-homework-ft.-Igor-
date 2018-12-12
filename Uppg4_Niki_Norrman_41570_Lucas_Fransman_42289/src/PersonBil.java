
public class PersonBil extends Fordon {
	public String maker;
	public String model;
	public int seats;
	public PersonBil(String regNr, String owner, String maker, String model, int seats) {
		super(regNr, owner);
		this.maker = maker;
		this.model = model;
		this.seats = seats;
		this.type = 3;
	}
	public String getModel() {
		return this.model;
	}
	public String getMaker() {
		return this.maker;
	}
	public int getSeats() {
		return this.seats;
	}

}
