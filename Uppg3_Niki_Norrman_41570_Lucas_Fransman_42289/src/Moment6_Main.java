
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Moment6_Main {

	public static void main(String[] args) {
		int n = 0;
		int checker = 0;
		while (checker < 1) { // loopen avslutas n�r usern givit ett heltal
		try {
			n = Integer.parseInt(JOptionPane.showInputDialog("Antal personer.\nObs ger du mer personer �n du angett kommer de gamla �verskrivas.")); // m�ngd personer
		} catch (Exception e ) {
				checker--;
				JOptionPane.showMessageDialog(null, "Ge en nummer");
			}
		checker++;
		}
		
		String finalStr = "\n";
		Person person = null;
		String name = "";
		String soc = "";
		int counter = 0;
		ArrayList <Person> listOfPersons = new ArrayList <> (); // lista f�r personer
		while (true) {
			Methods x = new Methods(); // Methods constructor
			String getName = x.getNameAndSoc();
			if (getName != null) {
				while (!getName.contains(",")) { // f�ngar felaktiga inputs
					JOptionPane.showMessageDialog(null, "Check input.");
					getName = x.getNameAndSoc();
				}
			}
			int updateCounter = 0;
			if (getName != null) {
				counter++;
				soc = x.getSoc(getName);
				name = x.getName(getName);
				person = x.createPerson(name, soc);
				listOfPersons.add(person);
				if (listOfPersons.size() > n) {
					Person updatedPerson =  listOfPersons.get(counter - n); // tar personen fr�n listan som ska uppdateras
					updatedPerson.updatePerson(); // updaterar personen
					listOfPersons.remove(updateCounter); // tar bort den gammla personen
					listOfPersons.set(updateCounter, updatedPerson); // l�gger in den nya personen
					updateCounter++;
					counter --;
					if (updateCounter >= n) {
						updateCounter = 0; // nollar uppdate counter varje g�ng den n�r max index s� den b�rjar overwritea fr�n b�rjan av listan igen
					}
				}
		
			} else {  // break if avbryt
				break;
			}
		}
		
		for (int i = listOfPersons.size() - 1; i > -1; i--) {  // g�r s� att det senaste namnet visas h�gst uppe
			 Person listPerson = listOfPersons.get(i);
			 finalStr += listPerson.getDescription(listPerson.getName(), listPerson.getSoc()) + "\n";
		}
		
			JOptionPane.showMessageDialog(null,"Du tryckte cancel.\nDe senaste " + counter + " personerna du givit var: " + finalStr); // output
		}
	
}

