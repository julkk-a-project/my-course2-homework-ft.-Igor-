
public class PersonBil extends Fordon {
	public String maker;
	public String model;
	public String seats;
	public PersonBil(String regNr, String owner, String maker, String model, String seats) {
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
	public String getSeats() {
		return this.seats;
	}

}
