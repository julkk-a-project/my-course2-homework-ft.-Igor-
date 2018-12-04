
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Moment5_Main {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Antal personer.\nObs ger du mer personer än du angett kommer de gamla överskrivas.")); // mängd personer
		String finalStr = "\n";
		Person person = null;
		String name = "";
		String soc = "";
		int counter = 0;
		ArrayList <Person> listOfPersons = new ArrayList <> (); // lista för personer
		while (true) {
			String getName = getNameAndSoc();
			int updateCounter = 0;
			if (getName != null) {
				counter++;
				name = getName(getName);
				soc = getSoc(getName);
				person = createPerson(name, soc);
				listOfPersons.add(person);
				if (listOfPersons.size() > n) {
					Person updatedPerson =  listOfPersons.get(counter - n); // tar personen från listan som ska uppdateras
					updatedPerson.updatePerson(); // updaterar personen
					listOfPersons.remove(updateCounter); // tar bort den gammla personen
					listOfPersons.set(updateCounter, updatedPerson); // lägger in den nya personen
					updateCounter++;
					counter --;
					if (updateCounter >= n) {
						updateCounter = 0; // nollar uppdate counter varje gång den når max index så den börjar overwritea från början av listan igen
					}
				}
		
			} else {  // break if avbryt
				break;
			}
		}
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // gör så att det senaste namnet visas högst uppe
			 Person listPerson = listOfPersons.get(i);
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + "\n";
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr); // output
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

	private static String getName(String name) { // gets name
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

