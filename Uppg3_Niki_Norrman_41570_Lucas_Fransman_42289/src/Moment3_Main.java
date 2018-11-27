import javax.swing.JOptionPane;

public class Moment3_Main {

	public static void main(String[] args) {
		Person person = null;
		String name = "";
		String soc = "";
		int counter = 0;
		while (true) {
			String getName = getNameAndSoc();
			if (getName != null) {
				counter++;
				name = getName(getName);
				soc = getSoc(getName);
				person = createPerson(name, soc);
			} else {
				break;
			}
		}
		JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDu har givit " + counter + " personer.\nDen senaste personen du matade in var: " + person.getDescription(name, soc) + ".");
	}

	private static String getSoc(String name) { 
		String part2 = "";
			String[] parts = name.split(",");
			part2 = parts[1];
			return part2;
	}

	private static String getName(String name) {
		String part1 = ""; 
		try {
			String[] parts = name.split(",");
			part1 = parts[0]; 
			
		} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Check input.");
			}
		return part1;
	}

	private static Person createPerson(String name, String soc) {
		Person person = new Person(name, soc);
		return person;
	}
	
	private static String getNameAndSoc() {
		String nameAndSoc = "Error";
		try {
			nameAndSoc =  JOptionPane.showInputDialog("Skriv in namn och socialsignum separerat med , tecken  \nex. Kalle Karlsson, 280295367H");
			if (nameAndSoc == null) {
				return null;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Check input.");
			getNameAndSoc();
		}
		return nameAndSoc;
	}
}
