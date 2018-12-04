
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Moment7_Main {

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

		Person person = null;
		String name = "";
		String soc = "";
		int counter = 0;
		Methods x = new Methods(); // Methods constructor
		ArrayList <Person> listOfPersons = new ArrayList <> (); // lista f�r personer
		while (true) {
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
		String nOrF = JOptionPane.showInputDialog("Vill du granska om det finns personer med samma namn eller f�delsedag.\n(1)Namn\n(2)F�delsedag\n( )Ingendera\n");
		
		if(nOrF.equals("1")) {
			x.nameOutput(listOfPersons, counter); // kollar om det finns personer med samma namn
				
			} else if (nOrF.equals("2")) {
				x.birthdayOutput(listOfPersons, counter); // kollar om det finns personer med samma f�delsedag
				
			} else {
				x.output(listOfPersons, counter);
				
			}
		}
	}
