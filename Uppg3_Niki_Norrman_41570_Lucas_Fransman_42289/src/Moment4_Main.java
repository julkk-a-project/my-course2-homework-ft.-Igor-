import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Moment4_Main {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Antal personer.")); // mängd personer
		String finalStr = "\n";
		Person person = null;
		String name = "";
		String soc = "";
		String getName = "";
		int counter = 0;
		ArrayList <Person> listOfPersons = new ArrayList <> (); // lista för personer
		while (true) {
			getName = getNameAndSoc();
			if (getName != null) {
				counter++;
				name = getName(getName);
				soc = getSoc(getName);
				person = createPerson(name, soc);
				listOfPersons.add(person);
			} else { // break if avbryt
				break;
			}
			
			if (listOfPersons.size() == n) { // break if max antal personer
				break;
			}
		}
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) { // gör så att det senaste namnet visas högst uppe
			 Person listPerson = listOfPersons.get(i);
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + "\n";
		}
		
		if (listOfPersons.size() == n) { // output
			JOptionPane.showMessageDialog(null,"Du matade in max antalet personer.\nDe senaste " + counter + " personerna du givit var: " + finalStr);
		} else { // output
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr);
		}
	}

	private static String getSoc(String name) { // returns social signum
		String part2 = "";
		try {
			String[] parts = name.split(",");
			part2 = parts[1];
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Check input.");
		}
			return part2;
	}

	private static String getName(String name) { // returns namnet
		String part1 = ""; 
		try {
			String[] parts = name.split(",");
			part1 = parts[0]; 
			
		} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Check input.");
			}
		return part1;
	}

	private static Person createPerson(String name, String soc) { // calls person constructor
		Person person = new Person(name, soc);
		return person;
	}
	
	/*
	 * gets name and social signum
	 */
	
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

