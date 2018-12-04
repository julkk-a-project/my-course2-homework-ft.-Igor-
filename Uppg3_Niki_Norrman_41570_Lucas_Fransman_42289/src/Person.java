import java.util.Arrays;

public class Person {
	public String namn;
	public String socialSignum;
	
	public Person(String namn, String socialSignum) { // constructor
		this.namn = namn;
		this.socialSignum = socialSignum;
	}
	
	public String getDescription(String namn, String socialSignum) { // returnerar sträng med namn och socialsignum
		return namn + " med socialskyddssignum " + socialSignum;
	}

	public void updatePerson() { // updates namn och socialsignum
		String xName = getName();
		String xSoc = getSoc();
		namn = xName;
		socialSignum = xSoc;
	}
	
	public String getName() { // returns name
		return namn;
	}
	
	public String getSoc() { // returns social signum
		return socialSignum;
	}
	public String getFornamn() {
		String[] forNamn = (namn.split(" "));
		return forNamn[0];
	}
}
