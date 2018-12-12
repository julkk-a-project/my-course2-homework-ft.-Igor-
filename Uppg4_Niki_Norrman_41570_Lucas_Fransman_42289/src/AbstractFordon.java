
public abstract class AbstractFordon {
	public String regNr;
	public String owner;
	public int type = 0;
	
	public String getRegNr() {
		return this.regNr;
	}
	public String getOwner() {
		return this.owner; 
	}
	public int getType() {
		return this.type;
	}
}
