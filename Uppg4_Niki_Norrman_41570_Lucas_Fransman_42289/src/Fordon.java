
public class Fordon extends AbstractFordon {
	IEgenskaper info;
	
	
	public Fordon(String regNr, String owner) {
		this.regNr = regNr;
		this.owner = owner;
		this.type = 1;
		
	}


	@Override
	public String getProperties() {
		return regNr+": "+owner;
	}
	

}
