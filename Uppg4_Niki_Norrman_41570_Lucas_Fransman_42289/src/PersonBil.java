
public class PersonBil extends Fordon {
	public String maker;
	public String model;
	public int seats;
	public PersonBil(String regNr, String owner, String maker, String model, int seats) {
		super(regNr, owner);
		this.maker = maker;
		this.model = model;
		this.seats = seats;
	}

}
