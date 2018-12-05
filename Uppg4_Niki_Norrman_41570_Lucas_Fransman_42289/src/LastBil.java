
public class LastBil extends Fordon {
	public String model;
	public String maker;
	public LastBil(String regNr, String owner, String maker, String model) {
		super(regNr, owner);
		this.maker = maker;
		this.model = model;
	}

}
