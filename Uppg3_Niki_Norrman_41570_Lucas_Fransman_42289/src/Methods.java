import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Används i Moment6 och 7
 */

public class Methods {
	
	public void utskrift(int counter, String name, String soc, Person person, ArrayList<Person> listOfPersons,
			int n, String finalStr) {
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // gör så att det senaste namnet visas högst uppe
			 Person listPerson = listOfPersons.get(i);
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + "\n";
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr); // output	
	}
	
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
			nameAndSoc = JOptionPane.showInputDialog("Skriv in namn och socialsignum separerat med , tecken. \nKom ihåg mellanrum mellan för och efternamn  \nex. Kalle Karlsson, 280295367H");
			String name = getName(nameAndSoc);
			if (!name.contains(" ") || name.contains("0") || name.contains("2") || name.contains("3") || name.contains("4") || name.contains("5") || name.contains("6") || name.contains("7") || name.contains("8") || name.contains("9") || name.contains("10")) { // error om namnet innehåller siffror
				int z = 1 / 0; // error om siffror i namnet eller inte mellanrum mellan för och efternamn
			}
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
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // gör så att det senaste namnet visas högst uppe
			 Person listPerson = listOfPersons.get(i);
			 listOfNames.remove(i);
			 for (int i2 = 0; i2 < listOfNames.size(); i2++) {
				 if (listPerson.getFornamn().equals((listOfNames.get(i2)))){ // jämför namnen
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
		ArrayList <String> listOfBirthdays = new ArrayList <> (); // skapar en lista med dom 4 första siffrorna i socialsignumet alltså födelsedagen
		String fodelsedag = "";
		for (int i1 = 0; i1 < listOfPersons.size(); i1++) {  // fyller listan med födelsedagarna
			String day = listOfPersons.get(i1).getSoc().substring(0, 4);
			listOfBirthdays.add(day);
		}
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // gör så att det senaste namnet visas högst uppe
			 Person listPerson = listOfPersons.get(i);
			 listOfBirthdays.remove(i);
			 for (int i2 = 0; i2 < listOfBirthdays.size(); i2++) {
				 if (listPerson.getSoc().substring(0, 4).equals(listOfBirthdays.get(i2))){ // jämför födelsedagarna
					fodelsedag = " (födelsedag)";
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
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // gör så att det senaste namnet visas högst uppe
			 Person listPerson = listOfPersons.get(i);
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + "\n";
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr); // output*/
	}
	
}
