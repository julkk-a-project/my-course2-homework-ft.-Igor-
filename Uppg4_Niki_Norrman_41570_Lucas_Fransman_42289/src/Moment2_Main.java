import javax.swing.JOptionPane;

public class Moment2_Main {



	
	public static void main(String[] args) {
		AbstractFordon[] fordonar = new AbstractFordon[10];
		int listLength = 0;
		int choice = 0;
		while (choice != -1 && choice != 2) { 
			choice = mainMenu(listLength);
			if (choice == 0) {
				int choice2 = typeChoser();
				if (choice2 != -1 && choice2 != 3) {
					int max = getInt("how many instances do you want to register?\n(Note that you can still register " + (10-listLength) + " instances.)", 10-listLength); //get integer from user
					for (int i = 0; i < max; i++) {
						listLength++;
						itemAdder(fordonar, listLength-1, choice2); //for "Fordon"
					}
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

	public static int typeChoser() { //För att hålla det consistent så skriver jag "Vehicle" iställe för fordon, "Car" istället för persionbil och "Truck" istället för lastbil.
		String[] options = new String [] {"Vehicle", "Truck", "Car", "Back"};
		int choser = JOptionPane.showOptionDialog(null, "What type do you want to register?\n\nVehicles take two inputs (owner, regNum)\n"
													+ "Trucks take four inputs (owner, regNum, maker, model)\n"
													+ "Cars take five inputs (owner, regNum, maker, model, doorNum)\n\n"
													+ "(you will later be promted to say how many of that specific vehicle you want to register in a row)", "Type Choser", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, options, options[3]);
		return choser;
	}
	
	public static AbstractFordon[] itemAdder(AbstractFordon[] fordonar, int i, int typeChoise) {
		AbstractFordon newItem = null;
		if (typeChoise == 0) {
			newItem = createVehicle();
		}
		else if (typeChoise == 1) {
			newItem = createTruck();
		}
		else if (typeChoise == 2) {
			newItem = createCar();
		}
		fordonar[i] = newItem;
		return fordonar;
	}
	
	
	
	//DEFUSE VEHICLE CREATORS
	
	public static AbstractFordon createVehicle(){
		String[] carInfo = new String[2];
		carInfo = getVehicleInfo(); //get regNr and owner info from user
		AbstractFordon fordonlol = new Fordon(carInfo[0], carInfo[1]);
		return fordonlol;
	}
	public static AbstractFordon createTruck(){
		String[] carInfo = new String[4];
		carInfo = getTruckInfo(); //get regNr and owner info from user
		AbstractFordon fordonlol = new LastBil(carInfo[0], carInfo[1], carInfo[2], carInfo[3]);
		return fordonlol;
	}
	public static AbstractFordon createCar(){
		String[] carInfo = new String[5];
		carInfo = getCarInfo(); //get regNr and owner info from user
		AbstractFordon fordonlol = new PersonBil(carInfo[0], carInfo[1], carInfo[2], carInfo[3], carInfo[4]);
		return fordonlol;
	}
	
	
	
	
	
	
	
	//READER
	
	public static void itemReader(AbstractFordon[] fordonar, int max) {
		String buf = "[Reg. number]: [Owner], [Maker], [Model], [Seats]\n";
		for (int i = 0; i < max; i++) {
			int type = fordonar[i].getType();
			String regNr = fordonar[i].getRegNr();
			String owner = fordonar[i].getOwner();
			buf += "["+ regNr +"]: " + owner;
			if (type == 2){
				String maker = ((LastBil)fordonar[i]).getMaker();
				String model = ((LastBil)fordonar[i]).getModel();
				buf += ", " + maker + ", " + model;
			}
			if (type == 3){
				String maker = ((PersonBil)fordonar[i]).getMaker();
				String model = ((PersonBil)fordonar[i]).getModel();
				String seats = ((PersonBil)fordonar[i]).getSeats();
				buf += ", " + maker + ", " + model + ", " + seats;
			}
			buf += "\n";
		}
		JOptionPane.showMessageDialog(null, buf);
	}
	
	
	
	
	
	
	
	//InputTools:
	
	public static int getInt(String string, int max) {
		String SInt = JOptionPane.showInputDialog(string);	
		int amount = -1;
		try {
			amount = Integer.parseInt(SInt);
		} catch (NumberFormatException ex ) {
			JOptionPane.showMessageDialog(null, "Try an integer..."); //this is really annoying, but as long as the user follows what the program wants, then... basically the program works as intended. i know how to fix it but can't bother w/ it unless someone forces me.
			amount = getInt(string, max);
		}
		if (amount < 1 || amount > max) {
			JOptionPane.showMessageDialog(null, "Try an integer between 1 and "+max+"...");
			return getInt(string, max);
		} else {
			return amount;
		}
	}
	
	
	
	//ACTUAL VEHICLE CREATORS

	public static String[] getVehicleInfo(){
		String[] buf2 = new String[2];
		try {
			String buf1 = JOptionPane.showInputDialog("Type the following information:\n"
													+ "[Registration nr], [Owner]\n"
													+ "seperated by a [,]comma\n");
		
			buf2 = buf1.split(",");
			if (buf2.length == 2) {
				return buf2;
			} else {
				JOptionPane.showMessageDialog(null, "try reading the instructions...", "Error",0);
				return getVehicleInfo();
			}
		}catch(NullPointerException e ){
			JOptionPane.showMessageDialog(null, "I'm sorry but you must complete this task first!", "you pressed X", 2); //this is really annoying, but as long as the user follows what the program wants, then... basically the program works as intended. i know how to fix it but can't bother w/ it unless someone forces me.
			return getVehicleInfo();
		}
	}
	public static String[] getTruckInfo(){
		String[] buf2 = new String[4];
		try {
			String buf1 = JOptionPane.showInputDialog("Type the following information:\n"
													+ "[Registration nr], [Owner], [Manufacturer], [Model]\n"
													+ "seperated by a [,]comma\n");
		
			buf2 = buf1.split(",");
			if (buf2.length == 4) {
				return buf2;
			} else {
				JOptionPane.showMessageDialog(null, "try reading the instructions...", "Error",0);
				return getTruckInfo();
			}
		}catch(NullPointerException e ){
			JOptionPane.showMessageDialog(null, "I'm sorry but you must complete this task first!", "you pressed X", 2); //this is really annoying, but as long as the user follows what the program wants, then... basically the program works as intended. i know how to fix it but can't bother w/ it unless someone forces me.
			return getTruckInfo();
		}
	}
	public static String[] getCarInfo(){
		String[] buf2 = new String[5];
		try {
			String buf1 = JOptionPane.showInputDialog("Type the following information:\n"
													+ "[Registration nr], [Owner], [Manufacturer], [Model], [number of seats]\n"
													+ "seperated by a [,]comma\n");
		
			buf2 = buf1.split(",");
			if (buf2.length == 5) {
				return buf2;
			} else {
				JOptionPane.showMessageDialog(null, "try reading the instructions...", "Error",0);
				return getCarInfo();
			}
		}catch(NullPointerException e ){
			JOptionPane.showMessageDialog(null, "I'm sorry but you must complete this task first!", "you pressed X", 2); //this is really annoying, but as long as the user follows what the program wants, then... basically the program works as intended. i know how to fix it but can't bother w/ it unless someone forces me.
			return getCarInfo();
		}
	}

}
