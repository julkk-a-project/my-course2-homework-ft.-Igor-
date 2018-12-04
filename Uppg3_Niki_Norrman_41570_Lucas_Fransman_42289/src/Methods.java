import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * Anv�nds i Moment6 och 7
 */

public class Methods {
	
	public String getSoc(String name) { // returns social signum
		String part2 = "";
		try {
			String[] parts = name.split(",");
			part2 = parts[1];
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Check input.");
		}
			return part2;
	}

	public String getName(String name) { // gets name
		String part1 = ""; 
		try {
			String[] parts = name.split(",");
			part1 = parts[0]; 
			
		} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Check input.");
			}
		return part1;
	}

	public Person createPerson(String name, String soc) { // calls person constructor
		Person person = new Person(name, soc);
		return person;
	}
	
	/*
	 * gets name and social signum
	 */
	
	public String getNameAndSoc() { 
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
	public void nameOutput(ArrayList<Person> listOfPersons, int counter) {
		String finalStr = "\n";
		ArrayList <String> listOfNames = new ArrayList <> (); // skapar en lista med alla namn
		String namn = "";
		for (int i1 = 0; i1 < listOfPersons.size(); i1++) { // fyller listan med namnen
			String forNamn = listOfPersons.get(i1).getFornamn();
			listOfNames.add(forNamn);
		}
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // g�r s� att det senaste namnet visas h�gst uppe
			 Person listPerson = listOfPersons.get(i);
			 listOfNames.remove(i);
			 for (int i2 = 0; i2 < listOfNames.size(); i2++) {
				 if (listPerson.getFornamn().equals((listOfNames.get(i2)))){ // j�mf�r namnen
					namn = " (namn)";
				 } 
			 }
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + namn + "\n";
			 namn = "3";
			 listOfNames.add(i, listPerson.getFornamn());
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr); // output
	}
	
	public void birthdayOutput(ArrayList<Person> listOfPersons, int counter) {
		String finalStr = "\n";
		ArrayList <String> listOfBirthdays = new ArrayList <> (); // skapar en lista med dom 4 f�rsta siffrorna i socialsignumet allts� f�delsedagen
		String fodelsedag = "";
		for (int i1 = 0; i1 < listOfPersons.size(); i1++) {  // fyller listan med f�delsedagarna
			String day = listOfPersons.get(i1).getSoc().substring(0, 4);
			listOfBirthdays.add(day);
		}
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // g�r s� att det senaste namnet visas h�gst uppe
			 Person listPerson = listOfPersons.get(i);
			 listOfBirthdays.remove(i);
			 for (int i2 = 0; i2 < listOfBirthdays.size(); i2++) {
				 if (listPerson.getSoc().substring(0, 4).equals(listOfBirthdays.get(i2))){ // j�mf�r f�delsedagarna
					fodelsedag = " (f�delsedag)";
				 } 
			 }
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + fodelsedag + "\n";
			 fodelsedag = "";
			 listOfBirthdays.add(i, listPerson.getSoc().substring(0, 4));
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr); // output
			
	}
	
	public void output(ArrayList<Person> listOfPersons, int counter) {
		String finalStr = "\n"; 
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // g�r s� att det senaste namnet visas h�gst uppe
			 Person listPerson = listOfPersons.get(i);
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + "\n";
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr); // output*/
	}
	public String Fornamn(String namn) {
		String[] forNamn = (namn.split(" "));
		return forNamn[0];
	}
}
