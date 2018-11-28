
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Moment5_Main {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Antal personer.\nObs ger du mer personer än du angett kommer de gamla överskrivas."));
		String finalStr = "\n";
		Person person = null;
		String name = "";
		String soc = "";
		int counter = 0;
		ArrayList <Person> listOfPersons = new ArrayList <> ();
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
					Person updatedPerson =  listOfPersons.get(counter - n);
					updatedPerson.updatePerson();
					listOfPersons.remove(updateCounter);
					listOfPersons.set(updateCounter, updatedPerson);
					updateCounter++;
					counter --;
					if (updateCounter >= n) {
						updateCounter = 0;
					}
				}
		
			} else {
				break;
			}
		}
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) {
			 Person listPerson = listOfPersons.get(i);
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + "\n";
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr);
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

