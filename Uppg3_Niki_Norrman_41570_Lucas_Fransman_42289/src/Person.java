
public class Person {
	public String namn;
	public String socialSignum;
	
	public Person(String namn, String socialSignum) {
		this.namn = namn;
		this.socialSignum = socialSignum;
	}
	
	public String getDescription(String namn, String socialSignum) {
		return namn + ", med socialskyddssignum " + socialSignum;
	}
}
