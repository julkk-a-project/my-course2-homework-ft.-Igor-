import javax.swing.JOptionPane;

public class Moment1_Main {



	
	public static void main(String[] args) {
		AbstractFordon[] fordonar = new AbstractFordon[10];
		AbstractFordon fordonlol = new Fordon("Pappaman","Pappa");
		fordonar[0] = fordonlol;
		int listLength = 0;
		int choice = 0;
		while (choice != -1 && choice != 2) { 
			choice = mainMenu(listLength);
			if (choice == 0) {
				int max = getInt("how many cars do you want to register?\n(Note that you can only register up to 10 total cars.);"); //get int from user between 1 and 10
				for (int i = 0; i < max; i++) {
					listLength++;
					itemAdder(fordonar, listLength-1);
				}
			}
			else if (choice == 1) {
				itemReader(fordonar, listLength);
			}
			else if (choice == 2 || choice == -1) {
				JOptionPane.showMessageDialog(null, "It's sad to see you go :(");
			}
		}
	}
	
	public static int mainMenu(int carNum) {
		String[] options = new String [] {"Add vehicle(s)", "Read list", "Close program"};
		int choser = JOptionPane.showOptionDialog(null, "You have registered "+carNum+" out of 10 cars.\nWhat do you want to do?", "Main Menu", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, options, options[2]);
		return choser;
	}
	
	public static AbstractFordon[] itemAdder(AbstractFordon[] fordonar, int i) {
		AbstractFordon newItem = createItem();
		fordonar[i] = newItem;
		return fordonar;
	}
	
	public static AbstractFordon createItem(){
		String[] carInfo = new String[2];
		carInfo = getCarInfo(); //get regNr and owner info from user
		AbstractFordon fordonlol = new Fordon(carInfo[0], carInfo[1]);
		return fordonlol;
	}
	
	public static void itemReader(AbstractFordon[] fordonar, int max) {
		String buf = "[Owner]: [Reg. number]\n";
		for (int i = 0; i < max; i++) {
			String regNr = fordonar[i].getRegNr();
			String owner = fordonar[i].getOwner();
			buf += owner +": "+ regNr + "\n";
		}
		JOptionPane.showMessageDialog(null, buf);
	}
	
	
	
	
	
	
	
	//InputTools:
	
	public static int getInt(String string) {
		String SInt = JOptionPane.showInputDialog(string);	
		int amount = -1;
		try {
			amount = Integer.parseInt(SInt);
		} catch (NumberFormatException ex ) {
			JOptionPane.showMessageDialog(null, "Try an integer...");
			amount = getInt(string);
		}
		if (amount < 1 || amount > 10) {
			JOptionPane.showMessageDialog(null, "Try a value between 1 and 10...");
			return getInt(string);
		} else {
			return amount;
		}
	}
	
	public static String[] getCarInfo(){
		String[] buf2 = new String[2];
		try {
			String buf1 = JOptionPane.showInputDialog("Type Registration number and name of owner,\n seperated by a [,]comma");
		
			buf2 = buf1.split(",");
			if (buf2.length == 2) {
				return buf2;
			} else {
				JOptionPane.showMessageDialog(null, "try reading the instructions...", "Error",0);
				return getCarInfo();
			}
		}catch(NullPointerException e ){
			JOptionPane.showMessageDialog(null, "I'm sorry but you must complete this task first!", "you pressed X", 2);
			return getCarInfo();
		}
	}

}
